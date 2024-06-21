package com.gilbert.jooq.film.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.gilbert.jooq.film.entity.*;
import lombok.RequiredArgsConstructor;
import org.jooq.*;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.generated.tables.pojos.FilmActor;

import static org.jooq.impl.DSL.*;

@RequiredArgsConstructor
@Repository
public class FilmRepository {

    private static final Film_ FILM = Film_.FILM;
    private static final FilmActor_ FILM_ACTOR = FilmActor_.FILM_ACTOR;
    private static final Actor_ ACTOR = Actor_.ACTOR;
    private static final Inventory_ INVENTORY = Inventory_.INVENTORY;
    public static final Rental_ RENTAL = Rental_.RENTAL;
    private final DSLContext dslContext;

    public Film findById(long id ) {
        return dslContext.select(FILM.fields())
            .from(FILM)
            .where(FILM.FILM_ID.eq(id))
            .fetchOneInto(Film.class);
    }

    public FIlmInfo findFilmInfoById(long id) {
        return dslContext.select(
                FILM.FILM_ID,
                FILM.TITLE,
                FILM.DESCRIPTION
            ).from(FILM)
            .where(FILM.FILM_ID.eq(id))
            .fetchOneInto(FIlmInfo.class);
    }

    public List<FilmAndActor> findAllFilmAndActors(long page, long pageSize) {
        return dslContext.select(
                row(FILM.fields()),
                row(FILM_ACTOR.fields()),
                row(ACTOR.fields())
            ).from(FILM_ACTOR)
            .join(FILM)
            .on(FILM.FILM_ID.eq(FILM_ACTOR.FILM_ID))
            .join(ACTOR)
            .on(ACTOR.ACTOR_ID.eq(FILM_ACTOR.ACTOR_ID))
            .offset((page - 1) * pageSize)
            .limit(pageSize)
            .fetchInto(FilmAndActor.class);
    }

    public FilmAndActors findFilmAndActorsUsingSelectSubQuery(long filmId) {
        return dslContext.select(
                row(FILM.fields()),
                multiset(
                    select(FILM_ACTOR.fields())
                        .from(FILM_ACTOR)
                        .where(FILM_ACTOR.FILM_ID.eq(FILM.FILM_ID))
                ).convertFrom(r -> r.into(FilmActor.class))
            ).from(FILM)
            .where(FILM.FILM_ID.eq(filmId))
            .limit(100)
            .fetchOneInto(FilmAndActors.class);
    }

    public List<FilmAndActors> findFilmAndActorsUsingJoin(long filmId) {
        return dslContext.select(
                row(FILM.fields()).as("film"),
                row(FILM_ACTOR.fields()).as("film_actor")
            ).from(FILM)
            .join(FILM_ACTOR)
            .on(FILM_ACTOR.FILM_ID.eq(FILM.FILM_ID))
            .where(FILM.FILM_ID.eq(filmId))
            .limit(100)
            .fetchGroups(record -> record.get("film", Film.class),
                record -> record.get("film_actor", FilmActor.class))
            .entrySet()
            .stream()
            .map(entry -> new FilmAndActors(entry.getKey(), entry.getValue()))
            .toList();
    }

    public List<FilmPriceSummary> findFilmPriceSummaryByFilmTitle(String filmTitle) {
        return dslContext.select(
                FILM.FILM_ID,
                FILM.TITLE,
                FILM.RENTAL_RATE,
                case_()
                    .when(FILM.RENTAL_RATE.le(BigDecimal.valueOf(1.0)), "Cheap")
                    .when(FILM.RENTAL_RATE.le(BigDecimal.valueOf(3.0)), "Moderate")
                    .else_("Expensive")
                    .as("price_category"),
                selectCount()
                    .from(INVENTORY)
                    .where(INVENTORY.FILM_ID.eq(FILM.FILM_ID)).asField("total_inventory")
            )
            .from(FILM)
            .where(likeFilmTitle(filmTitle))
            .fetchInto(FilmPriceSummary.class);
    }

    private LikeEscapeStep likeFilmTitle(String filmTitle) {
        return FILM.TITLE.like("%" + filmTitle + "%");
    }

    public List<FilmRentalSummary> findFilmRentalSummaryByFilmTitle(String filmTitle) {
        Table<Record2<Long, BigDecimal>> rentalDurationInfoSubQuery = select(
            INVENTORY.FILM_ID,
            avg(localDateTimeDiff(DatePart.DAY, RENTAL.RENTAL_DATE, RENTAL.RETURN_DATE)).as("average_rental_duration")
        ).from(RENTAL)
            .join(INVENTORY)
            .on(INVENTORY.INVENTORY_ID.eq(RENTAL.INVENTORY_ID))
            .where(RENTAL.RETURN_DATE.isNotNull())
            .groupBy(INVENTORY.FILM_ID)
            .asTable("rental_duration_info");

        return dslContext.select(
                FILM.FILM_ID,
                FILM.TITLE,
                rentalDurationInfoSubQuery.field("average_rental_duration")
            ).from(FILM)
            .join(rentalDurationInfoSubQuery)
            .on(FILM.FILM_ID.eq(rentalDurationInfoSubQuery.field(INVENTORY.FILM_ID)))
            .where(likeFilmTitle(filmTitle))
            .orderBy(field(name("average_rental_duration")).desc())
            .fetchInto(FilmRentalSummary.class);
    }

    public List<Film> findRentedFilmByFilmTitle(String filmTitle) {
        SelectConditionStep<Record1<Integer>> rentalSubQuery = selectOne()
            .from(INVENTORY)
            .join(RENTAL)
            .on(RENTAL.INVENTORY_ID.eq(INVENTORY.INVENTORY_ID))
            .where(INVENTORY.FILM_ID.eq(FILM.FILM_ID));

        return dslContext.select(row(FILM.fields()))
            .from(FILM)
            .whereExists(rentalSubQuery)
            .and(FILM.TITLE.like("%" + filmTitle + "%"))
            .fetchInto(Film.class);
    }
}
