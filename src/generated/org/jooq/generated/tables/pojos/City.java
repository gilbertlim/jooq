/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;


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
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long cityId;
    private String city;
    private Long countryId;
    private LocalDateTime lastUpdate;

    public City() {}

    public City(City value) {
        this.cityId = value.cityId;
        this.city = value.city;
        this.countryId = value.countryId;
        this.lastUpdate = value.lastUpdate;
    }

    public City(
        Long cityId,
        String city,
        Long countryId,
        LocalDateTime lastUpdate
    ) {
        this.cityId = cityId;
        this.city = city;
        this.countryId = countryId;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.city.city_id</code>.
     */
    public Long getCityId() {
        return this.cityId;
    }

    /**
     * Setter for <code>sakila.city.city_id</code>.
     */
    public City setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    /**
     * Getter for <code>sakila.city.city</code>.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>sakila.city.city</code>.
     */
    public City setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>sakila.city.country_id</code>.
     */
    public Long getCountryId() {
        return this.countryId;
    }

    /**
     * Setter for <code>sakila.city.country_id</code>.
     */
    public City setCountryId(Long countryId) {
        this.countryId = countryId;
        return this;
    }

    /**
     * Getter for <code>sakila.city.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.city.last_update</code>.
     */
    public City setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final City other = (City) obj;
        if (this.cityId == null) {
            if (other.cityId != null)
                return false;
        }
        else if (!this.cityId.equals(other.cityId))
            return false;
        if (this.city == null) {
            if (other.city != null)
                return false;
        }
        else if (!this.city.equals(other.city))
            return false;
        if (this.countryId == null) {
            if (other.countryId != null)
                return false;
        }
        else if (!this.countryId.equals(other.countryId))
            return false;
        if (this.lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        }
        else if (!this.lastUpdate.equals(other.lastUpdate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.cityId == null) ? 0 : this.cityId.hashCode());
        result = prime * result + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result + ((this.countryId == null) ? 0 : this.countryId.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("City (");

        sb.append(cityId);
        sb.append(", ").append(city);
        sb.append(", ").append(countryId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
