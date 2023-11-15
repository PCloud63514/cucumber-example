package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseHelper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void truncateAll() {
        jdbcTemplate.execute("SELECT H2VERSION() FROM DUAL");
        jdbcTemplate.queryForList("SHOW TABLES", String.class)
                .forEach(showTables ->
                        jdbcTemplate.execute("TRUNCATE TABLE %s".formatted(showTables)
                        )
                );
    }
}
