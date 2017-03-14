package com.rc.users.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by root on 3/13/17.
 */
@ComponentScan(basePackages = "com.rc.users")
@Configuration
@EntityScan( "com.rc.users.model")
@EnableJpaRepositories("com.rc.users.repository")
public class UserManagementDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
