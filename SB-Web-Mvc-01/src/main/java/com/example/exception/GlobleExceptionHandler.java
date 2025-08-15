package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public ModelAndView globleExceptionHandler(Exception e) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("error", "Please wait or retry after some time technical issue::");
		mav.setViewName("error");
		return mav;	
	}

}
