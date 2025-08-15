package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient  //application act as client for eureca server
@EnableFeignClients  // to devlope feign client
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
