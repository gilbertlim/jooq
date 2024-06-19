/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.Category_;
import org.jooq.generated.tables.pojos.Category;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.category.category_id</code>.
     */
    public CategoryRecord setCategoryId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.category.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.category.name</code>.
     */
    public CategoryRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.category.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.category.last_update</code>.
     */
    public CategoryRecord setLastUpdate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
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
     * Create a detached CategoryRecord
     */
    public CategoryRecord() {
        super(Category_.CATEGORY);
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(Long categoryId, String name, LocalDateTime lastUpdate) {
        super(Category_.CATEGORY);

        setCategoryId(categoryId);
        setName(name);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(Category value) {
        super(Category_.CATEGORY);

        if (value != null) {
            setCategoryId(value.getCategoryId());
            setName(value.getName());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
