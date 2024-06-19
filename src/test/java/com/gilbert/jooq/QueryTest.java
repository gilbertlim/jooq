package com.gilbert.jooq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.jooq.DSLContext;
import org.jooq.generated.tables.Actor_;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class QueryTest {

    @Autowired
    DSLContext dslContext;

    @Test
    void select() {
        dslContext.selectFrom(Actor_.ACTOR)
            .limit(10)
            .fetch();
    }
}
