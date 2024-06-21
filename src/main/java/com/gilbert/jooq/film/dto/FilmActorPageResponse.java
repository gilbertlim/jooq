package com.gilbert.jooq.film.dto;

import java.util.List;

import com.gilbert.jooq.common.dto.PageResponse;
import com.gilbert.jooq.film.entity.FilmAndActor;
import lombok.Getter;

@Getter
public class FilmActorPageResponse {

    private final PageResponse page;
    private final List<FilmActorResponse> filmActors;

    public FilmActorPageResponse(PageResponse page, List<FilmAndActor> filmActors) {
        this.page = page;
        this.filmActors = filmActors.stream()
            .map(FilmActorResponse::new)
            .toList();
    }

    @Getter
    public static class FilmActorResponse {

        private final String filmTitle;
        private final String actorFullName;
        private final Long filmId;

        public FilmActorResponse(FilmAndActor filmAndActor) {
            this(filmAndActor.getTitle(),
                filmAndActor.getActorFullName(),
                filmAndActor.getFilmId());
        }

        private FilmActorResponse(String filmTitle, String actorFullName, Long filmId) {
            this.filmTitle = filmTitle;
            this.actorFullName = actorFullName;
            this.filmId = filmId;
        }

    }

}
