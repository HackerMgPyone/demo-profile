package com.example.demoprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DemoProfileApplication {

    @Value("${app.name}")
    private String name;
    @Bean @Profile("db")
    public ApplicationRunner runner() {
        return r -> {
            System.out.println("AppName::" + name);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoProfileApplication.class, args);
    }

}
