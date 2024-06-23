/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.routines;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.generated.Sakila_;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


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
public class GetCustomerBalance_ extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sakila.get_customer_balance.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.DECIMAL(5, 2), false, false);

    /**
     * The parameter <code>sakila.get_customer_balance.p_customer_id</code>.
     */
    public static final Parameter<Integer> P_CUSTOMER_ID = Internal.createParameter("p_customer_id", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>sakila.get_customer_balance.p_effective_date</code>.
     */
    public static final Parameter<LocalDateTime> P_EFFECTIVE_DATE = Internal.createParameter("p_effective_date", SQLDataType.LOCALDATETIME(0), false, false);

    /**
     * Create a new routine call instance
     */
    public GetCustomerBalance_() {
        super("get_customer_balance", Sakila_.SAKILA, SQLDataType.DECIMAL(5, 2));

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_CUSTOMER_ID);
        addInParameter(P_EFFECTIVE_DATE);
    }

    /**
     * Set the <code>p_customer_id</code> parameter IN value to the routine
     */
    public void setPCustomerId(Integer value) {
        setValue(P_CUSTOMER_ID, value);
    }

    /**
     * Set the <code>p_customer_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public GetCustomerBalance_ setPCustomerId(Field<Integer> field) {
        setField(P_CUSTOMER_ID, field);
        return this;
    }

    /**
     * Set the <code>p_effective_date</code> parameter IN value to the routine
     */
    public void setPEffectiveDate(LocalDateTime value) {
        setValue(P_EFFECTIVE_DATE, value);
    }

    /**
     * Set the <code>p_effective_date</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public GetCustomerBalance_ setPEffectiveDate(Field<LocalDateTime> field) {
        setField(P_EFFECTIVE_DATE, field);
        return this;
    }
}
