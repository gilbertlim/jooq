package com.gilbert.jooq.film.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JooqDaoTest {

    @Autowired
    FilmRepositoryIsA filmRepositoryIsA;

    @Autowired
    FilmRepositoryHasA filmRepositoryHasA;

    @Test
    void isA() {
        // 필요 없는 함수도 외부로 노출됨
        Film film = filmRepositoryIsA.findById(1L);
    }

    @Test
    void hasA() {
        Film film = filmRepositoryHasA.findById(1L);
    }

    @Test
    void isA_FetchRangeOfLength() {
        int start = 100;
        int end = 180;
        List<Film> films = filmRepositoryIsA.fetchRangeOfLength_(start, end);
        assertThat(films).allSatisfy(
            film -> assertThat(film.getLength()).isBetween(start, end)
        );
    }

    @Test
    void hasA_FetchRangeOfLength() {
        int start = 100;
        int end = 180;
        List<Film> films = filmRepositoryHasA.fetchRangeOfLength(start, end);
        assertThat(films).allSatisfy(
            film -> assertThat(film.getLength()).isBetween(start, end)
        );
    }
}