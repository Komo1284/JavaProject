package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itbank.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService hs;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("total", hs.total(10));
		return "ex01";
	}
}
