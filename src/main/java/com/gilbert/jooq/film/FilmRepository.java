package com.gilbert.jooq.film;

import org.springframework.stereotype.Repository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.Film_;
import org.jooq.generated.tables.pojos.Film;

@RequiredArgsConstructor
@Repository
public class FilmRepository {

    public static final Film_ FILM = Film_.FILM;
    private final DSLContext dslContext;

    public Film findById(long id ) {
        return dslContext.select(FILM.fields())
            .from(FILM)
            .where(FILM.FILM_ID.eq(id))
            .fetchOneInto(Film.class);
    }

}
