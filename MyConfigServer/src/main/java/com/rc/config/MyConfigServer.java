package com.rc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by root on 3/13/17.
 */
@EnableConfigServer
@SpringBootApplication
public class MyConfigServer {

    public static void main(String args[])
    {
        System.setProperty("spring.config.name","myconfig-server");
        SpringApplication.run(MyConfigServer.class,args);
    }
}
