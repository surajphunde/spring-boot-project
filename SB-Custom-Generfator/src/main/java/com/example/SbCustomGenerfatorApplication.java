package com.example;

import com.example.entity.OrderDetailsEntity;
import com.example.repo.CustomeRepo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbCustomGenerfatorApplication {

   
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbCustomGenerfatorApplication.class, args);
		CustomeRepo customeRepo = context.getBean(CustomeRepo.class);
		OrderDetailsEntity entity=new OrderDetailsEntity();
		entity.setOrderBy("ganesh");
		entity.setOrderPlaceDate(new Date());
		customeRepo.save(entity);
		System.out.println("Record inserted successfully....");
	}

}
