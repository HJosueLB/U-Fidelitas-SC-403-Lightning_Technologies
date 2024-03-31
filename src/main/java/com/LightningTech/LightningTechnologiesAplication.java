package com.LightningTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.LightningTech"}) 
public class LightningTechnologiesAplication {

    public static void main(String[] args) {
        SpringApplication.run(LightningTechnologiesAplication.class, args);
    }
}