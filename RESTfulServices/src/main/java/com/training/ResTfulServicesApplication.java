package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.training.controllers")
public class ResTfulServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTfulServicesApplication.class, args);
	}
}
