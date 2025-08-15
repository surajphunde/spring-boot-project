package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.BookService;

@SpringBootApplication
public class SbAutomicityApplication2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbAutomicityApplication2.class, args);
		BookService bookService = context.getBean(BookService.class);
		bookService.saveBook();
	
	}

}
