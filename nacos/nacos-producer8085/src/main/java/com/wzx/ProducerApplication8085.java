package com.wzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerApplication8085 {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication8085.class, args);
    }
}
