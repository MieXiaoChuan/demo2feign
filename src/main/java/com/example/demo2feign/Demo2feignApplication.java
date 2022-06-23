package com.example.demo2feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Demo2feignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo2feignApplication.class, args);
    }

}
