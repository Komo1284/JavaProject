package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.TestService;

@Controller
public class HomeController {
	
	@Autowired
	private TestService ts;
	
	@GetMapping("/")
	public String hello() {
		return "home";
	}
	
	@GetMapping("/ex01")
	public ModelAndView serviceTest() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("total", ts.total(10));
		
		return mav;
	}
	
	@GetMapping("/ex02")
	public ModelAndView daoTest() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ver", ts.test());
		
		return mav;
	}
}
