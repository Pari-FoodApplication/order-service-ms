package com.pari.foodapp.orderserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceAppApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
