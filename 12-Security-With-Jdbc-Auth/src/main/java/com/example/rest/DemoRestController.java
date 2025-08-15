package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/admin")
	public String admin() {
		return "<h3>welcome to admin</h3>";
		
	}
	@GetMapping("/user")
   public String user() {
		return "<h3>welcome to user</h3>";
		
	}
   
	@GetMapping("/")
   public String welcome() {
		return "<h3>welcome</h3>";
		
	}

}
