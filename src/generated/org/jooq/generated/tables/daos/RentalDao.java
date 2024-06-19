/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.Rental_;
import org.jooq.generated.tables.pojos.Rental;
import org.jooq.generated.tables.records.RentalRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RentalDao extends DAOImpl<RentalRecord, Rental, Integer> {

    /**
     * Create a new RentalDao without any configuration
     */
    public RentalDao() {
        super(Rental_.RENTAL, Rental.class);
    }

    /**
     * Create a new RentalDao with an attached configuration
     */
    public RentalDao(Configuration configuration) {
        super(Rental_.RENTAL, Rental.class, configuration);
    }

    @Override
    public Integer getId(Rental object) {
        return object.getRentalId();
    }

    /**
     * Fetch records that have <code>rental_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfRentalId_(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Rental_.RENTAL.RENTAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_id IN (values)</code>
     */
    public List<Rental> fetchByRentalId_(Integer... values) {
        return fetch(Rental_.RENTAL.RENTAL_ID, values);
    }

    /**
     * Fetch a unique record that has <code>rental_id = value</code>
     */
    public Rental fetchOneByRentalId_(Integer value) {
        return fetchOne(Rental_.RENTAL.RENTAL_ID, value);
    }

    /**
     * Fetch a unique record that has <code>rental_id = value</code>
     */
    public Optional<Rental> fetchOptionalByRentalId_(Integer value) {
        return fetchOptional(Rental_.RENTAL.RENTAL_ID, value);
    }

    /**
     * Fetch records that have <code>rental_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfRentalDate_(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Rental_.RENTAL.RENTAL_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_date IN (values)</code>
     */
    public List<Rental> fetchByRentalDate_(LocalDateTime... values) {
        return fetch(Rental_.RENTAL.RENTAL_DATE, values);
    }

    /**
     * Fetch records that have <code>inventory_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfInventoryId_(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental_.RENTAL.INVENTORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>inventory_id IN (values)</code>
     */
    public List<Rental> fetchByInventoryId_(Long... values) {
        return fetch(Rental_.RENTAL.INVENTORY_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfCustomerId_(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental_.RENTAL.CUSTOMER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<Rental> fetchByCustomerId_(Long... values) {
        return fetch(Rental_.RENTAL.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>return_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfReturnDate_(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Rental_.RENTAL.RETURN_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>return_date IN (values)</code>
     */
    public List<Rental> fetchByReturnDate_(LocalDateTime... values) {
        return fetch(Rental_.RENTAL.RETURN_DATE, values);
    }

    /**
     * Fetch records that have <code>staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfStaffId_(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Rental_.RENTAL.STAFF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    public List<Rental> fetchByStaffId_(Long... values) {
        return fetch(Rental_.RENTAL.STAFF_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfLastUpdate_(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Rental_.RENTAL.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Rental> fetchByLastUpdate_(LocalDateTime... values) {
        return fetch(Rental_.RENTAL.LAST_UPDATE, values);
    }
}
