package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {

       @GetMapping("/data")
	    @CircuitBreaker(name="suraj" , fallbackMethod = "fallback")
	    public String getData() {
	      System.out.println("welcome to getData()....");
	      int i=10/0;
	        return "radis data sent to your mail...";
	    }

	    public String fallback(Throwable t) {
	    	System.out.println("fallback method....");
	        return "Fallback response due to error:";
	    }
	}

