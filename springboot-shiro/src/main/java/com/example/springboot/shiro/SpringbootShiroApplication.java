package com.example.springboot.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot.shiro.mapper")
public class SpringbootShiroApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootShiroApplication.class, args);
    }

}
