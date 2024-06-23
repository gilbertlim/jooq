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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long customerId;
    private Long storeId;
    private String firstName;
    private String lastName;
    private String email;
    private Long addressId;
    private Byte active;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdate;

    public Customer() {}

    public Customer(Customer value) {
        this.customerId = value.customerId;
        this.storeId = value.storeId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.email = value.email;
        this.addressId = value.addressId;
        this.active = value.active;
        this.createDate = value.createDate;
        this.lastUpdate = value.lastUpdate;
    }

    public Customer(
        Long customerId,
        Long storeId,
        String firstName,
        String lastName,
        String email,
        Long addressId,
        Byte active,
        LocalDateTime createDate,
        LocalDateTime lastUpdate
    ) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.customer.customer_id</code>.
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>sakila.customer.customer_id</code>.
     */
    public Customer setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.store_id</code>.
     */
    public Long getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>sakila.customer.store_id</code>.
     */
    public Customer setStoreId(Long storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>sakila.customer.first_name</code>.
     */
    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>sakila.customer.last_name</code>.
     */
    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>sakila.customer.email</code>.
     */
    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.address_id</code>.
     */
    public Long getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>sakila.customer.address_id</code>.
     */
    public Customer setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.active</code>.
     */
    public Byte getActive() {
        return this.active;
    }

    /**
     * Setter for <code>sakila.customer.active</code>.
     */
    public Customer setActive(Byte active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    /**
     * Setter for <code>sakila.customer.create_date</code>.
     */
    public Customer setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Getter for <code>sakila.customer.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.customer.last_update</code>.
     */
    public Customer setLastUpdate(LocalDateTime lastUpdate) {
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
        final Customer other = (Customer) obj;
        if (this.customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!this.customerId.equals(other.customerId))
            return false;
        if (this.storeId == null) {
            if (other.storeId != null)
                return false;
        }
        else if (!this.storeId.equals(other.storeId))
            return false;
        if (this.firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!this.firstName.equals(other.firstName))
            return false;
        if (this.lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!this.lastName.equals(other.lastName))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.addressId == null) {
            if (other.addressId != null)
                return false;
        }
        else if (!this.addressId.equals(other.addressId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.createDate == null) {
            if (other.createDate != null)
                return false;
        }
        else if (!this.createDate.equals(other.createDate))
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
        result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
        result = prime * result + ((this.storeId == null) ? 0 : this.storeId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.addressId == null) ? 0 : this.addressId.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.createDate == null) ? 0 : this.createDate.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Customer (");

        sb.append(customerId);
        sb.append(", ").append(storeId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(email);
        sb.append(", ").append(addressId);
        sb.append(", ").append(active);
        sb.append(", ").append(createDate);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}
