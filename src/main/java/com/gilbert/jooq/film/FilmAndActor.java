package com.gilbert.jooq.film;

import lombok.RequiredArgsConstructor;
import org.jooq.generated.tables.pojos.*;

@RequiredArgsConstructor
public class FilmAndActor {

    private final Film film;
    private final FilmActor filmActor;
    private final Actor actor;

    public String getTitle() {
        return film.getTitle();
    }

    public String getActorFullName() {
        return actor.getFirstName() + " " + actor.getLastName();
    }

    public Long getFilmId() {
        return film.getFilmId();
    }
}
