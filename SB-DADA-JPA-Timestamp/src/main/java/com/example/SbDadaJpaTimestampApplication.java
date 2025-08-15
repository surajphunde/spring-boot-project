package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Contact;
import com.example.repository.ConractRepo;

@SpringBootApplication
public class SbDadaJpaTimestampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDadaJpaTimestampApplication.class, args);
		ConractRepo bean = context.getBean(ConractRepo.class);
		
		Contact c= new Contact();
		c.setContactNum(154);
		c.setContactName("suraj");
		
		bean.save(c);
	
	}

}
