package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.UserDataBean;

import jakarta.validation.Valid;

@Controller
public class FormController {
	   @GetMapping("/form")
	  public String formRegister(Model model) {
		  model.addAttribute("userDataBean", new UserDataBean());  // empty object for form binding
		return "register";
		  
	  }
	
	   //send data from UI to controller @ModelAttribute
	   @PostMapping("/submit")
		  public String formSubmit(@Valid @ModelAttribute("userDataBean") UserDataBean userDataBean,BindingResult bindingResult, Model model) {
		 if(bindingResult.hasErrors()) {
			 return "register";
		 }
		   model.addAttribute("userDataBean", userDataBean);  
		   model.addAttribute("message", "form Submitted successfully....");
			return "submit";
			  
		  }
	
	
}
