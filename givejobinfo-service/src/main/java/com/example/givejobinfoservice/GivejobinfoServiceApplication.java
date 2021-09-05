package com.example.givejobinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GivejobinfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GivejobinfoServiceApplication.class, args);
    }

}
