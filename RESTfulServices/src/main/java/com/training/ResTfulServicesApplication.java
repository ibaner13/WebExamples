package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.training.controllers")
public class ResTfulServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulServicesApplication.class, args);
	}
}
