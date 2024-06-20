package com.gilbert.jooq.film;

import org.springframework.stereotype.Repository;
import org.jooq.Configuration;
import org.jooq.generated.tables.daos.FilmDao;

@Repository
public class FilmRepositoryIsA extends FilmDao {

    public FilmRepositoryIsA(Configuration configuration) {
        super(configuration);
    }
}
