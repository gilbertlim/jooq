package com.gilbert.jooq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.gilbert.jooq.film.entity.FilmPriceSummary;
import com.gilbert.jooq.film.entity.FilmRentalSummary;
import com.gilbert.jooq.film.repository.FilmRepository;
import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class JooqSubQueryTest {


    @Autowired
    private FilmRepository filmRepository;

    @Test
    void scalar() {
        String filmTitle = "EGG";
        List<FilmPriceSummary> summaries = filmRepository.findFilmPriceSummaryByFilmTitle(filmTitle);
    }

    @Test
    void inline_view() {
        String filmTitle = "EGG";
        List<FilmRentalSummary> summaries = filmRepository.findFilmRentalSummaryByFilmTitle(filmTitle);
    }

    @Test
    void where() {
        String filmTitle = "EGG";
        List<Film> films = filmRepository.findRentedFilmByFilmTitle(filmTitle);
    }
}
