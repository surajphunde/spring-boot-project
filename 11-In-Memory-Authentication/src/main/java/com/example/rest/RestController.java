package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {

	    @GetMapping("/public/test")
	    public String publicTest() {
	        return "This is public!";
	    }

	    @GetMapping("/secure")
	    public String secureTest() {
	        return "This is secure!";
	    }
	}
