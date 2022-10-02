package com.px.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class InitServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitServerApplication.class, args);
    }

}
