package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;

@Controller
public class ExController {
	
	@Autowired
	private BoardService bs;

	@GetMapping("/ex02")
	public ModelAndView ex02() {
		// mav에 viewName을 지정하지 않으면 void와 동일한 효과
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ver", bs.test());
		
		return mav;
	}
}
