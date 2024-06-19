/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.FilmText_;
import org.jooq.generated.tables.pojos.FilmText;
import org.jooq.generated.tables.records.FilmTextRecord;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmTextDao extends DAOImpl<FilmTextRecord, FilmText, Integer> {

    /**
     * Create a new FilmTextDao without any configuration
     */
    public FilmTextDao() {
        super(FilmText_.FILM_TEXT, FilmText.class);
    }

    /**
     * Create a new FilmTextDao with an attached configuration
     */
    public FilmTextDao(Configuration configuration) {
        super(FilmText_.FILM_TEXT, FilmText.class, configuration);
    }

    @Override
    public Integer getId(FilmText object) {
        return object.getFilmId();
    }

    /**
     * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<FilmText> fetchRangeOfFilmId_(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(FilmText_.FILM_TEXT.FILM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<FilmText> fetchByFilmId_(Integer... values) {
        return fetch(FilmText_.FILM_TEXT.FILM_ID, values);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public FilmText fetchOneByFilmId_(Integer value) {
        return fetchOne(FilmText_.FILM_TEXT.FILM_ID, value);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public Optional<FilmText> fetchOptionalByFilmId_(Integer value) {
        return fetchOptional(FilmText_.FILM_TEXT.FILM_ID, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<FilmText> fetchRangeOfTitle_(String lowerInclusive, String upperInclusive) {
        return fetchRange(FilmText_.FILM_TEXT.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<FilmText> fetchByTitle_(String... values) {
        return fetch(FilmText_.FILM_TEXT.TITLE, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<FilmText> fetchRangeOfDescription_(String lowerInclusive, String upperInclusive) {
        return fetchRange(FilmText_.FILM_TEXT.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<FilmText> fetchByDescription_(String... values) {
        return fetch(FilmText_.FILM_TEXT.DESCRIPTION, values);
    }
}
