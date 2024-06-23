/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;

import javax.annotation.processing.Generated;

import org.jooq.Record1;
import org.jooq.generated.enums.FilmRating;
import org.jooq.generated.tables.Film_;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film.film_id</code>.
     */
    public FilmRecord setFilmId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.film_id</code>.
     */
    public Long getFilmId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.film.title</code>.
     */
    public FilmRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.film.description</code>.
     */
    public FilmRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.film.release_year</code>.
     */
    public FilmRecord setReleaseYear(Year value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.release_year</code>.
     */
    public Year getReleaseYear() {
        return (Year) get(3);
    }

    /**
     * Setter for <code>sakila.film.language_id</code>.
     */
    public FilmRecord setLanguageId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.language_id</code>.
     */
    public Long getLanguageId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>sakila.film.original_language_id</code>.
     */
    public FilmRecord setOriginalLanguageId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.original_language_id</code>.
     */
    public Long getOriginalLanguageId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>sakila.film.rental_duration</code>.
     */
    public FilmRecord setRentalDuration(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.rental_duration</code>.
     */
    public Integer getRentalDuration() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>sakila.film.rental_rate</code>.
     */
    public FilmRecord setRentalRate(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.rental_rate</code>.
     */
    public BigDecimal getRentalRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>sakila.film.length</code>.
     */
    public FilmRecord setLength(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.length</code>.
     */
    public Integer getLength() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>sakila.film.replacement_cost</code>.
     */
    public FilmRecord setReplacementCost(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.replacement_cost</code>.
     */
    public BigDecimal getReplacementCost() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>sakila.film.rating</code>.
     */
    public FilmRecord setRating(FilmRating value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.rating</code>.
     */
    public FilmRating getRating() {
        return (FilmRating) get(10);
    }

    /**
     * Setter for <code>sakila.film.special_features</code>.
     */
    public FilmRecord setSpecialFeatures(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.special_features</code>.
     */
    public String getSpecialFeatures() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sakila.film.last_update</code>.
     */
    public FilmRecord setLastUpdate(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film_.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Long filmId, String title, String description, Year releaseYear, Long languageId, Long originalLanguageId, Integer rentalDuration, BigDecimal rentalRate, Integer length, BigDecimal replacementCost, FilmRating rating, String specialFeatures, LocalDateTime lastUpdate) {
        super(Film_.FILM);

        setFilmId(filmId);
        setTitle(title);
        setDescription(description);
        setReleaseYear(releaseYear);
        setLanguageId(languageId);
        setOriginalLanguageId(originalLanguageId);
        setRentalDuration(rentalDuration);
        setRentalRate(rentalRate);
        setLength(length);
        setReplacementCost(replacementCost);
        setRating(rating);
        setSpecialFeatures(specialFeatures);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Film value) {
        super(Film_.FILM);

        if (value != null) {
            setFilmId(value.getFilmId());
            setTitle(value.getTitle());
            setDescription(value.getDescription());
            setReleaseYear(value.getReleaseYear());
            setLanguageId(value.getLanguageId());
            setOriginalLanguageId(value.getOriginalLanguageId());
            setRentalDuration(value.getRentalDuration());
            setRentalRate(value.getRentalRate());
            setLength(value.getLength());
            setReplacementCost(value.getReplacementCost());
            setRating(value.getRating());
            setSpecialFeatures(value.getSpecialFeatures());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
