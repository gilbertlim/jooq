package com.gilbert.jooq.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.gilbert.jooq.web.FilmActorPageResponse;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FilmRepositoryTest {

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    FilmService filmService;

    @Test
    void findById() {
        Film film = filmRepository.findById(1L);
        assertThat(film.getFilmId()).isEqualTo(1L);
    }

    @Test
    void findFilmInfoById() {
        FIlmInfo filmInfo = filmRepository.findFilmInfoById(1L);
        assertThat(filmInfo.getFilmId()).isEqualTo(1L);
    }

    @Test
    void findAllFilmAndActors() {
        FilmActorPageResponse filmActorPageResponse = filmService.getFilmActorPageResponse(1L, 20L);
        assertThat(filmActorPageResponse.getFilmActors()).hasSize(20);
    }
}