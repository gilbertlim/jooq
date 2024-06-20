package com.gilbert.jooq.film;

import java.util.List;

import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.impl.DSL;

@RequiredArgsConstructor
@Repository
public class FilmRepository {

    private static final Film_ FILM = Film_.FILM;
    private static final FilmActor_ FILM_ACTOR = FilmActor_.FILM_ACTOR;
    private static final Actor_ ACTOR = Actor_.ACTOR;
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
                DSL.row(FILM.fields()),
                DSL.row(FILM_ACTOR.fields()),
                DSL.row(ACTOR.fields())
            ).from(FILM_ACTOR)
            .join(FILM)
            .on(FILM.FILM_ID.eq(FILM_ACTOR.FILM_ID))
            .join(ACTOR)
            .on(ACTOR.ACTOR_ID.eq(FILM_ACTOR.ACTOR_ID))
            .offset((page - 1) * pageSize)
            .limit(pageSize)
            .fetchInto(FilmAndActor.class);
    }
}
