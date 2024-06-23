package com.gilbert.jooq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.gilbert.jooq.film.entity.FilmAndActor;
import com.gilbert.jooq.film.repository.FilmRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
public class JooqJoinShortcutTest {

    @Autowired
    FilmRepository filmRepository;

    @Test
    void implicitMto1() {
        long page = 1L;
        long pageSize = 10L;
        List<FilmAndActor> original = filmRepository.findAllFilmAndActors(page, pageSize);
        //List<FilmAndActor> implicit = filmRepository.findAllFilmAndActorsUsingImplicitPathJoinManyToOne(page, pageSize);
        //assertThat(original).usingRecursiveFieldByFieldElementComparator()
        //    .isEqualTo(implicit);
        assertThatThrownBy(() -> filmRepository.findAllFilmAndActorsUsingImplicitPathJoinManyToOne(page, pageSize));
    }

    @Test
    void implicit1toN() {
        long page = 1L;
        long pageSize = 10L;
        List<FilmAndActor> original = filmRepository.findAllFilmAndActors(page, pageSize);
        //List<FilmAndActor> implicit = filmRepository.findAllFilmAndActorsUsingImplicitPathJoinOneToMany(page, pageSize);
        //assertThat(original).usingRecursiveFieldByFieldElementComparator()
        //    .isEqualTo(implicit);
        assertThatThrownBy(() -> filmRepository.findAllFilmAndActorsUsingImplicitPathJoinOneToMany(page, pageSize));
    }

    @Test
    void explicitNto1() {
        long page = 1L;
        long pageSize = 10L;
        List<FilmAndActor> original = filmRepository.findAllFilmAndActors(page, pageSize);
        List<FilmAndActor> explicit = filmRepository.findAllFilmAndActorsUsingExplicitPathJoinManyToOne(page, pageSize);
        assertThat(original).usingRecursiveFieldByFieldElementComparator()
            .isEqualTo(explicit);
    }

    @Test
    void explicit1toN() {
        long page = 1L;
        long pageSize = 10L;
        List<FilmAndActor> original = filmRepository.findAllFilmAndActors(page, pageSize);
        List<FilmAndActor> explicit = filmRepository.findAllFilmAndActorsUsingExplicitPathJoinOneToMany(page, pageSize);
        assertThat(original).usingRecursiveFieldByFieldElementComparator()
            .isEqualTo(explicit);
    }
}
