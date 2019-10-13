package com.example.laowngluntan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.laowngluntan.mapper")
public class LaowngluntanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaowngluntanApplication.class, args);
    }

}
