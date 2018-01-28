package com.agilyze.simple.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.agilyze.simple.spring")
public class SimpleSpringApplication implements ApplicationRunner {

    @Autowired
    MySpringService service;

    public static void main(String[] args) {

        System.out.println("Starting up simple Spring application");

        SpringApplication.run(SimpleSpringApplication.class, args);
    }

   @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        service.sayHi();

    }

}
