package com.gilbert.jooq.common.jooq.utils;

import java.util.Collection;

import org.springframework.util.CollectionUtils;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.impl.DSL;

public class JooqUtils {

    public static <T> Condition inIfNotEmpty(Field<T> field, Collection<T> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            return DSL.noCondition();
        }
        return field.in(collection);
    }
}
