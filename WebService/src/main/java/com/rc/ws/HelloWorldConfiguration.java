package com.rc.ws;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public  class  HelloWorldConfiguration{
    public static void main(String[] args)
    {
        System.setProperty("spring.config.name","registration-server");
        SpringApplication.run(HelloWorldConfiguration.class,args);
    }
}