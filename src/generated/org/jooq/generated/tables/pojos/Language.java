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
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long languageId;
    private String name;
    private LocalDateTime lastUpdate;

    public Language() {}

    public Language(Language value) {
        this.languageId = value.languageId;
        this.name = value.name;
        this.lastUpdate = value.lastUpdate;
    }

    public Language(
        Long languageId,
        String name,
        LocalDateTime lastUpdate
    ) {
        this.languageId = languageId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.language.language_id</code>.
     */
    public Long getLanguageId() {
        return this.languageId;
    }

    /**
     * Setter for <code>sakila.language.language_id</code>.
     */
    public Language setLanguageId(Long languageId) {
        this.languageId = languageId;
        return this;
    }

    /**
     * Getter for <code>sakila.language.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>sakila.language.name</code>.
     */
    public Language setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>sakila.language.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.language.last_update</code>.
     */
    public Language setLastUpdate(LocalDateTime lastUpdate) {
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
        final Language other = (Language) obj;
        if (this.languageId == null) {
            if (other.languageId != null)
                return false;
        }
        else if (!this.languageId.equals(other.languageId))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
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
        result = prime * result + ((this.languageId == null) ? 0 : this.languageId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Language (");

        sb.append(languageId);
        sb.append(", ").append(name);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
