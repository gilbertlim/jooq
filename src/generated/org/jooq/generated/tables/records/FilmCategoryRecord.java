/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Record2;
import org.jooq.generated.tables.FilmCategory_;
import org.jooq.generated.tables.pojos.FilmCategory;
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
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film_category.film_id</code>.
     */
    public FilmCategoryRecord setFilmId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_category.film_id</code>.
     */
    public Long getFilmId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.film_category.category_id</code>.
     */
    public FilmCategoryRecord setCategoryId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_category.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>sakila.film_category.last_update</code>.
     */
    public FilmCategoryRecord setLastUpdate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory_.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(Long filmId, Long categoryId, LocalDateTime lastUpdate) {
        super(FilmCategory_.FILM_CATEGORY);

        setFilmId(filmId);
        setCategoryId(categoryId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(FilmCategory value) {
        super(FilmCategory_.FILM_CATEGORY);

        if (value != null) {
            setFilmId(value.getFilmId());
            setCategoryId(value.getCategoryId());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
