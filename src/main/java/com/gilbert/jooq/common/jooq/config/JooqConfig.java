package com.gilbert.jooq.common.jooq.config;

import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.jooq.conf.ExecuteWithoutWhere;
import org.jooq.conf.RenderImplicitJoinType;

@Configuration
public class JooqConfig {

    @Bean
    public DefaultConfigurationCustomizer jooqDefaultConfigurationCustomizer() {
        return c -> c.set(PerformanceListener::new)
            .settings()
            .withRenderSchema(false) // schema가 보이지 않도록 설정
            .withExecuteUpdateWithoutWhere(ExecuteWithoutWhere.THROW)
            .withExecuteDeleteWithoutWhere(ExecuteWithoutWhere.THROW)
            //.withRenderImplicitJoinToManyType(RenderImplicitJoinType.INNER_JOIN)
            .withRenderImplicitJoinToManyType(RenderImplicitJoinType.THROW) // 1:N 비활성화
            .withRenderImplicitJoinType(RenderImplicitJoinType.THROW) // N:1 비활성화
            ;
    }

}
