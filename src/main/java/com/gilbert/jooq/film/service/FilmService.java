package com.gilbert.jooq.film.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.gilbert.jooq.common.dto.PageResponse;
import com.gilbert.jooq.film.dto.FilmActorPageResponse;
import com.gilbert.jooq.film.entity.FilmAndActor;
import com.gilbert.jooq.film.repository.FilmRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmActorPageResponse getFilmActorPageResponse(long page, long pageSize) {
        List<FilmAndActor> filmAndActors = filmRepository.findAllFilmAndActors(page, pageSize);
        PageResponse pageResponse = new PageResponse(page, pageSize);
        return new FilmActorPageResponse(pageResponse, filmAndActors);
    }
}
