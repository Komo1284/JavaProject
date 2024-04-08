package com.itbank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/{page}")
	public ModelAndView view(@PathVariable int page) {
		
		int reqPage = page != 0 ? page : 1;
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("bd", bs.list(reqPage));
		mav.setViewName("home");
		
		return mav;
	}
	
}
