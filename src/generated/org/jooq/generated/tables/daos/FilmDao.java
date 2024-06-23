/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Optional;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.generated.enums.FilmRating;
import org.jooq.generated.tables.Film_;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.generated.tables.records.FilmRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.19.10",
        "schema version:1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmDao extends DAOImpl<FilmRecord, Film, Long> {

    /**
     * Create a new FilmDao without any configuration
     */
    public FilmDao() {
        super(Film_.FILM, Film.class);
    }

    /**
     * Create a new FilmDao with an attached configuration
     */
    public FilmDao(Configuration configuration) {
        super(Film_.FILM, Film.class, configuration);
    }

    @Override
    public Long getId(Film object) {
        return object.getFilmId();
    }

    /**
     * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfFilmId_(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Film_.FILM.FILM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<Film> fetchByFilmId_(Long... values) {
        return fetch(Film_.FILM.FILM_ID, values);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public Film fetchOneByFilmId_(Long value) {
        return fetchOne(Film_.FILM.FILM_ID, value);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public Optional<Film> fetchOptionalByFilmId_(Long value) {
        return fetchOptional(Film_.FILM.FILM_ID, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfTitle_(String lowerInclusive, String upperInclusive) {
        return fetchRange(Film_.FILM.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<Film> fetchByTitle_(String... values) {
        return fetch(Film_.FILM.TITLE, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfDescription_(String lowerInclusive, String upperInclusive) {
        return fetchRange(Film_.FILM.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<Film> fetchByDescription_(String... values) {
        return fetch(Film_.FILM.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>release_year BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfReleaseYear_(Year lowerInclusive, Year upperInclusive) {
        return fetchRange(Film_.FILM.RELEASE_YEAR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>release_year IN (values)</code>
     */
    public List<Film> fetchByReleaseYear_(Year... values) {
        return fetch(Film_.FILM.RELEASE_YEAR, values);
    }

    /**
     * Fetch records that have <code>language_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfLanguageId_(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Film_.FILM.LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<Film> fetchByLanguageId_(Long... values) {
        return fetch(Film_.FILM.LANGUAGE_ID, values);
    }

    /**
     * Fetch records that have <code>original_language_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<Film> fetchRangeOfOriginalLanguageId_(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Film_.FILM.ORIGINAL_LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>original_language_id IN (values)</code>
     */
    public List<Film> fetchByOriginalLanguageId_(Long... values) {
        return fetch(Film_.FILM.ORIGINAL_LANGUAGE_ID, values);
    }

    /**
     * Fetch records that have <code>rental_duration BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfRentalDuration_(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Film_.FILM.RENTAL_DURATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_duration IN (values)</code>
     */
    public List<Film> fetchByRentalDuration_(Integer... values) {
        return fetch(Film_.FILM.RENTAL_DURATION, values);
    }

    /**
     * Fetch records that have <code>rental_rate BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfRentalRate_(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Film_.FILM.RENTAL_RATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_rate IN (values)</code>
     */
    public List<Film> fetchByRentalRate_(BigDecimal... values) {
        return fetch(Film_.FILM.RENTAL_RATE, values);
    }

    /**
     * Fetch records that have <code>length BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfLength_(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Film_.FILM.LENGTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>length IN (values)</code>
     */
    public List<Film> fetchByLength_(Integer... values) {
        return fetch(Film_.FILM.LENGTH, values);
    }

    /**
     * Fetch records that have <code>replacement_cost BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfReplacementCost_(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Film_.FILM.REPLACEMENT_COST, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>replacement_cost IN (values)</code>
     */
    public List<Film> fetchByReplacementCost_(BigDecimal... values) {
        return fetch(Film_.FILM.REPLACEMENT_COST, values);
    }

    /**
     * Fetch records that have <code>rating BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfRating_(FilmRating lowerInclusive, FilmRating upperInclusive) {
        return fetchRange(Film_.FILM.RATING, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rating IN (values)</code>
     */
    public List<Film> fetchByRating_(FilmRating... values) {
        return fetch(Film_.FILM.RATING, values);
    }

    /**
     * Fetch records that have <code>special_features BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfSpecialFeatures_(String lowerInclusive, String upperInclusive) {
        return fetchRange(Film_.FILM.SPECIAL_FEATURES, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>special_features IN (values)</code>
     */
    public List<Film> fetchBySpecialFeatures_(String... values) {
        return fetch(Film_.FILM.SPECIAL_FEATURES, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Film> fetchRangeOfLastUpdate_(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Film_.FILM.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Film> fetchByLastUpdate_(LocalDateTime... values) {
        return fetch(Film_.FILM.LAST_UPDATE, values);
    }
}
