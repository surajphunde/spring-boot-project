package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestCont {
 @GetMapping("/getStudent")
	public String getStudentInformation() {
		return "student is present";
	}
	
	
}
