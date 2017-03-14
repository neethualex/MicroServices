package com.rc.service.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by root on 3/2/17.
 */
@Configuration
@ComponentScan
@EntityScan("com.rc.model")
@EnableJpaRepositories("com.rc.intf")
public class AccountCreationService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AccountCreationService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
