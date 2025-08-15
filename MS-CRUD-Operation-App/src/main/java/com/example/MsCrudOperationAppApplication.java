package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.CustomerService;

@SpringBootApplication
public class MsCrudOperationAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MsCrudOperationAppApplication.class, args);
		CustomerService service = context.getBean(CustomerService.class);
		
	}

}
