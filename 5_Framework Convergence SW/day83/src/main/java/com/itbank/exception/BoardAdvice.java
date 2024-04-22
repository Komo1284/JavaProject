package com.itbank.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

// 예외를 도맡아 처리하는 클래스
@ControllerAdvice(basePackages = {"com.itbank.controller"})
public class BoardAdvice {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exep() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "예외 발생~");
		mav.setViewName("message");
		
		return mav;
	}
}
