package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/acc")
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO input, HttpSession session) {
		
		session.setAttribute("user", as.login(input));
		
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public String signUp(AccountVO input) {
		
		as.signUp(input);
		
		return "redirect:/";
	}
	@GetMapping("/myPage")
	public void myPage() {}
	
	@PostMapping("/update")
	public String update(AccountVO input) {
		
		as.update(input);
		
		return "redirect:/acc/logout";
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx) {
		as.delete(idx);
		
		return "redirect:/acc/logout";
	}
}
