package com.wpf.jop3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//启用缓存
@EnableCaching
public class Jop3Application {

    public static void main(String[] args) {
        SpringApplication.run(Jop3Application.class, args);
    }

}

