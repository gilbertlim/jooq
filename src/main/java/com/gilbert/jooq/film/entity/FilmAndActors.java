package com.gilbert.jooq.film.entity;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.generated.tables.pojos.FilmActor;

@Getter
@RequiredArgsConstructor
public class FilmAndActors {

    private final Film film;
    private final List<FilmActor> filmActors;

}
