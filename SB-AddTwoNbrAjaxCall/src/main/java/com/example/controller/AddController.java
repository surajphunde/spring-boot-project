package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddController {

	//send data from ui to controller
	@GetMapping("/add")
	@ResponseBody
	public int addTwoNbr(@RequestParam int num1, @RequestParam int num2) {
		return num1+num2;
	}
	
}
