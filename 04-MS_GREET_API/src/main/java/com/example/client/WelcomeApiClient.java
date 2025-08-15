package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="welcome-api")  //client service name
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String invokeWelcomeMsg();
}
