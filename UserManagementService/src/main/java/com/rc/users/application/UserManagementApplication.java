package com.rc.users.application;

import com.rc.users.dao.UserManagementDAO;
import com.rc.users.model.UserModel;
import com.rc.users.repository.UserManagementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Created by root on 3/13/17.
 */

@SpringBootApplication
@EnableDiscoveryClient
@Import(UserManagementDAO.class)
public class UserManagementApplication {

    public static void main(String args[])
    {
        System.setProperty("spring.config.name","usermanagement-server");
        SpringApplication.run(UserManagementApplication.class,args);
    }

    @Bean
    public CommandLineRunner preLoadData(UserManagementRepository repository)
    {
        return (args) -> {
            repository.deleteAll();
            repository.save(new UserModel("test_user","test_user","23"));

        };
    }


}
