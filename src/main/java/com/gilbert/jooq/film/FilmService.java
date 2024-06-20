package com.gilbert.jooq.film;

import java.util.List;

import org.springframework.stereotype.Service;
import com.gilbert.jooq.web.FilmActorPageResponse;
import com.gilbert.jooq.web.PageResponse;
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
