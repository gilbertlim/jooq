package com.gilbert.jooq.actor.entity;

import java.util.List;

import lombok.Getter;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.pojos.Film;

@Getter
public class ActorFilmography {

    private final Actor actor;
    private final List<Film> films;

    public ActorFilmography(Actor actor, List<Film> films) {
        this.actor = actor;
        this.films = films;
    }
}
