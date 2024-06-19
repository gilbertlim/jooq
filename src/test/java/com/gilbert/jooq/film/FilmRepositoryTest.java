package com.gilbert.jooq.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FilmRepositoryTest {

    @Autowired
    FilmRepository filmRepository;

    @Test
    void findById() {
        Film film = filmRepository.findById(1L);
        assertThat(film.getFilmId()).isEqualTo(1L);
    }
}