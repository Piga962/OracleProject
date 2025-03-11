package com.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ejemplo")
public class    TelegramApp {
    public static void main(String[] args){
        SpringApplication.run(TelegramApp.class, args);
    }
}
