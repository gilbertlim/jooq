package com.gilbert.jooq.actor.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import com.gilbert.jooq.actor.dto.ActorFilmographySearchCondition;
import com.gilbert.jooq.actor.entity.ActorFilmography;
import org.jooq.*;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.daos.ActorDao;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.generated.tables.records.ActorRecord;
import org.jooq.impl.DSL;

import static com.gilbert.jooq.common.jooq.utils.JooqUtils.inIfNotEmpty;
import static org.jooq.impl.DSL.row;
import static org.jooq.impl.DSL.select;

@Repository
public class ActorRepository {

    public static final Actor_ ACTOR = Actor_.ACTOR;
    public static final FilmActor_ FILM_ACTOR = FilmActor_.FILM_ACTOR;
    public static final Film_ FILM = Film_.FILM;
    private final DSLContext dslContext;
    private final ActorDao actorDao;

    public ActorRepository(DSLContext dslContext, Configuration configuration) {
        this.dslContext = dslContext;
        this.actorDao = new ActorDao(configuration);
    }

    public List<Actor> findByFirstNameAndLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
            .where(ACTOR.FIRST_NAME.eq(firstName).and(ACTOR.LAST_NAME.eq(lastName)))
            .fetchInto(Actor.class);
    }

    public List<Actor> findByFirstNameOrLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
            .where(ACTOR.FIRST_NAME.eq(firstName).or(ACTOR.LAST_NAME.eq(lastName)))
            .fetchInto(Actor.class);
    }

    public List<Actor> findByActorIdIn(List<Long> actorIds) {
        return dslContext.selectFrom(ACTOR)
            .where(inIfNotEmpty(ACTOR.ACTOR_ID, actorIds))
            .fetchInto(Actor.class);
    }

    public List<ActorFilmography> findActorFilmography(ActorFilmographySearchCondition condition) {
        return dslContext.select(
                row(ACTOR.fields()).as("actor"),
                row(FILM.fields()).as("film")
            ).from(ACTOR)
            .join(FILM_ACTOR).on(FILM_ACTOR.ACTOR_ID.eq(ACTOR.ACTOR_ID))
            .join(FILM).on(FILM.FILM_ID.eq(FILM_ACTOR.FILM_ID))
            .where(containsIfNotBlank(ACTOR.FIRST_NAME.concat(" ").concat(ACTOR.LAST_NAME), condition.getActorName()),
                containsIfNotBlank(FILM.TITLE, condition.getFilmTitle()))
            .fetchGroups(record -> record.get("actor", Actor.class),
                record -> record.get("film", Film.class))
            .entrySet()
            .stream()
            .map(entry -> new ActorFilmography(entry.getKey(), entry.getValue()))
            .toList();
    }

    private Condition containsIfNotBlank(Field<String> field, String inputString) {
        if (!StringUtils.hasText(inputString)) {
            return DSL.noCondition();
        }
        return field.like("%" + inputString + "%");
    }

    public Actor saveByDao(Actor actor) {
        actorDao.insert(actor);
        return actor;
    }

    public ActorRecord saveByRecord(Actor actor) {
        ActorRecord actorRecord = dslContext.newRecord(ACTOR, actor);
        actorRecord.insert();
        return actorRecord;
    }

    public Long saveWithReturningPkOnly(Actor actor) {
        return dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME
            ).values(
                actor.getFirstName(),
                actor.getLastName()
            ).returningResult(ACTOR.ACTOR_ID)
            .fetchOneInto(Long.class);
    }

    public Actor saveWithReturning(Actor actor) {
        return dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME
            ).values(
                actor.getFirstName(),
                actor.getLastName()
            ).returning(ACTOR.fields())
            .fetchOneInto(Actor.class);
    }

    public void bulkInsertWithRows(List<Actor> actors) {
        var rows = actors.stream()
            .map(actor -> row(actor.getFirstName(), actor.getLastName()))
            .toList();
        dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME
            ).valuesOfRows(rows)
            .execute();
    }

    public Actor insertSelect(Long actorId) {
        return dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME
            ).select(
                select(ACTOR.FIRST_NAME, ACTOR.LAST_NAME)
                    .from(ACTOR)
                    .where(ACTOR.ACTOR_ID.eq(actorId))
            ).returning()
            .fetchOneInto(Actor.class);
    }
}
