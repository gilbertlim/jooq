package com.gilbert.jooq.film;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.jooq.Configuration;
import org.jooq.generated.tables.daos.FilmDao;
import org.jooq.generated.tables.pojos.Film;

@Repository
public class FilmRepositoryHasA {

    private final FilmDao filmDao;

    public FilmRepositoryHasA(Configuration configuration) {
        this.filmDao = new FilmDao(configuration);
    }

    public Film findById(long id) {
        return filmDao.fetchOneByFilmId_(id);
    }

    public List<Film> fetchRangeOfLength(int start, int end) {
        return filmDao.fetchRangeOfLength_(start, end);
    }
}
