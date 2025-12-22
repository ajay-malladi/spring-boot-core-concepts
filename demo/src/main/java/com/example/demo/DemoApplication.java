package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Human h = context.getBean(Human.class);
        h.label();
//		Human h1=context.getBean(Human.class);
//		h1.label();
//here only one instance is created check through constructor(singleton)

//		Human h2=context.getBean(Human.class);
//		h2.label();
// here instance are created when they are called.(prototype)

    }

}
