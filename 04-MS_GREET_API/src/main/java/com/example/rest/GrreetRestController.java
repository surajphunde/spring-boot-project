package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.WelcomeApiClient;

@RestController
public class GrreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeApiClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg =" welcome to Greet API and ";
		
		String msg2 = welcomeApiClient.invokeWelcomeMsg();
		
		return msg.concat(msg2);
		
	}

}
