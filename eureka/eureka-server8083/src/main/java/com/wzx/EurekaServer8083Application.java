package com.wzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8083Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8083Application.class, args);
    }
}
