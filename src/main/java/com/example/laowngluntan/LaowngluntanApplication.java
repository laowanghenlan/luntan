package com.example.laowngluntan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.laowngluntan.mapper")
@EnableScheduling
public class LaowngluntanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaowngluntanApplication.class, args);
    }

}
