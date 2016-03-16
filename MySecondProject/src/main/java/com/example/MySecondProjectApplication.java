package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class MySecondProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MySecondProjectApplication.class, args);
		System.out.println(ctx.getBean(Book.class));
	}
}
