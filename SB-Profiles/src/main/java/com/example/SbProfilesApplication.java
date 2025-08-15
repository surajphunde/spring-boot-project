package com.example;

import com.example.entity.Contact;
import com.example.repo.ContactRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbProfilesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SbProfilesApplication.class, args);
		ContactRepo bean = context.getBean(ContactRepo.class);

		Contact contact = new Contact();
		
		contact.setContName("suraj");
		contact.setContAdd("Beed");
		bean.save(contact);
	}

}
