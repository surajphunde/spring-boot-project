package com.example;

import com.example.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.BookService;

@SpringBootApplication
   

public class SbInsertRecordCustomQueryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbInsertRecordCustomQueryApplication.class, args);
		BookService bookService = context.getBean(BookService.class);
		bookService.insertBookReordCustomQuery();
		System.out.println("transaction done...");
	}

}
