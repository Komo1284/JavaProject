package com.itbank.exception;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(basePackages = {"com.itbank.controller"})
public class AccountAdvice {

	@ExceptionHandler(LoginException.class)
	public ModelAndView loginEx(LoginException e) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", 0);
		mav.addObject("msg", e.getMessage());
		mav.setViewName("message");
		
		return mav;
	}
	
	@ExceptionHandler(DuplicateKeyException.class)
	public ModelAndView addEx() {
		
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", 0);
		mav.addObject("msg", "id/nick이 중복됩니다");
		
		return mav;
	}
	
}
