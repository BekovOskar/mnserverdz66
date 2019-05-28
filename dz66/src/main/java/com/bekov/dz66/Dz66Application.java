package com.bekov.dz66;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController

public class Dz66Application {

    public static void main(String[] args) {
        SpringApplication.run(Dz66Application.class, args);
    }

    @RequestMapping(value = "/")

    public String home() {

        return "Eureka Client application";

    }

}
