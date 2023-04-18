package com.tenco.bankexer.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.tenco.bankexer.handler.exception.CustomPageException;

@ControllerAdvice
public class MyPageExceptionHandler {
	
	@ExceptionHandler(CustomPageException.class)
	public ModelAndView handleRuntimePageException(CustomPageException e) {
		ModelAndView modelAndView = new ModelAndView("errorpage");
		modelAndView.addObject("statusCode", HttpStatus.NOT_FOUND.value());
		modelAndView.addObject("message", e.getMessage());
		return modelAndView;
	}

}
