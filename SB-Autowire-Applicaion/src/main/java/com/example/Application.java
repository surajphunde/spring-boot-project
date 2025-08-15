package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.UserDaoImp;
import com.example.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
	UserDaoImp s=	context.getBean(UserDaoImp.class);
	UserService sq=	context.getBean(UserService.class);
	
	System.out.println(">>>>>>>>UserDaoImp>>>>>>>>>"+s.hashCode());
	System.out.println(">>>>>>>UserService>>>>>>>>>>"+sq.hashCode());
	sq.getUserName(200);
	}

}
