package com.gilbert.jooq.common.jooq.config;

import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.jooq.conf.ExecuteWithoutWhere;

@Configuration
public class JooqConfig {

    @Bean
    public DefaultConfigurationCustomizer jooqDefaultConfigurationCustomizer() {
        return c -> c.set(PerformanceListener::new)
            .settings()
            .withRenderSchema(false) // schema가 보이지 않도록 설정
            .withExecuteUpdateWithoutWhere(ExecuteWithoutWhere.THROW)
            .withExecuteDeleteWithoutWhere(ExecuteWithoutWhere.THROW);
    }

}
