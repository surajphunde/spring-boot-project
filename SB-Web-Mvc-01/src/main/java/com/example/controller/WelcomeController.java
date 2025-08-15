package com.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		System.out.println("WelcomeController obj created...");
	}
	
	//send data from congtroller to UI
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
		System.out.println("getMsg()----executed");
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","welcome to web page..");
		//int id=10/0;
		mav.addObject("msg1","welcome to Hyd..");
		mav.setViewName("index");
		return mav;
	}

	//send data from congtroller to UI
		@GetMapping("/wcome")
		public String getMsg2(Model model) {
			model.addAttribute("msg4","welcome to Maharastra..");
			return "index";
		}
	
	
	
	
	//query param to send data UI to Controller
	@GetMapping("/demo")
	public String queryParam(@RequestParam String name,@RequestParam String city, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("city", city);
		return "index";
		
	}
	//path Param to send Data UI to controller
	@GetMapping("/path/{name}/{city}")
	public String pathParam(@PathVariable String name,@PathVariable String city, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("city", city);
		return "index";
		
	}
	

}
