package com.gilbert.jooq.common.jooq.config;

import java.time.Duration;

import lombok.extern.slf4j.Slf4j;
import org.jooq.*;
import org.jooq.tools.StopWatch;

@Slf4j
public class PerformanceListener implements ExecuteListener {

    private static final Duration SLOW_QUERY_LIMIT = Duration.ofSeconds(3);
    private StopWatch watch;

    @Override
    public void executeStart(ExecuteContext ctx) {
        watch = new StopWatch();
    }

    @Override
    public void executeEnd(ExecuteContext ctx) {
        long queryTimeNano = watch.split();
        if (queryTimeNano > SLOW_QUERY_LIMIT.getNano()) {
            Query query = ctx.query();
            log.warn(String.format("""
                slow query was occurred.
                time=%ss(over %ss), query=
                %s""",
                millisToSeconds(Duration.ofNanos(queryTimeNano)),
                SLOW_QUERY_LIMIT.toSeconds(),
                query)
            );
        }
    }

    private String millisToSeconds(Duration duration) {
        return String.format("%.1f", duration.toMillis() / 1000.0);
    }
}
