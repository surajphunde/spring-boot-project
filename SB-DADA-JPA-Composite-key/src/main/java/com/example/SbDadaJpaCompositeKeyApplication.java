package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Contact;
import com.example.entity.ContactPK;
import com.example.repo.ContactRepo;

@SpringBootApplication
public class SbDadaJpaCompositeKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDadaJpaCompositeKeyApplication.class, args);
		ContactRepo bean = context.getBean(ContactRepo.class);
		ContactPK pk=new ContactPK(101, 793772);
		Contact con=new Contact("suraj", "Talegaon", pk);
		bean.save(con);
	}

}
