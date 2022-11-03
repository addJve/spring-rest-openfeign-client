package com.addjve.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.addjve.openfeign")
public class SpringOpenfeignTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOpenfeignTestApplication.class, args);
    }

}
