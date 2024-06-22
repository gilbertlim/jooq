package com.gilbert.jooq.common.jooq.utils;

import java.util.Collection;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.impl.DSL;

import static org.jooq.impl.DSL.noField;
import static org.jooq.impl.DSL.val;

public class JooqUtils {

    public static <T> Condition inIfNotEmpty(Field<T> field, Collection<T> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            return DSL.noCondition();
        }
        return field.in(collection);
    }

    public static Field<String> setStringIfHasText(Field<String> field, String value) {
        return StringUtils.hasText(value) ? val(value) : noField(field);
    }
}
