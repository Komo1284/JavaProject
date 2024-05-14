package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/ex01")
	public ModelAndView ex01() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("subject", "파라미터 처리");
		
		return mav;
	}
	
	@PostMapping("/ex01")
	public ModelAndView ex01(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("ex01_result");
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		mav.addObject("msg", name + "님은 " + age + "세");
		
		return mav;
	}
	
	@GetMapping("/ex02")
	public ModelAndView ex02() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("per", new Person("홍길동", 33, 176.3));
		
		return mav;
	}
	
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("age", 20);
		
		return mav;
	}
	
	@GetMapping("/ex04")
	public ModelAndView ex04() {
		ModelAndView mav = new ModelAndView();
		
		Person[] pers = new Person[] {
				new Person("홍길동", 17, 176),
				new Person("김수진", 22, 158),
				new Person("이진수", 20, 170),
		};
		
		mav.addObject("list", pers);
		
		return mav;
	}
}
