package com.gilbert.jooq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;

import static org.jooq.impl.DSL.dual;
import static org.jooq.impl.DSL.field;

@SpringBootTest
public class JooqSlowQueryTest {

    @Autowired
    DSLContext dslContext;

    @Test
    void slow_query() {
        dslContext.select(field("SLEEP(4)"))
            .from(dual())
            .execute();
    }
}
