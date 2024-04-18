package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService as;
	
	@GetMapping("/list")
	public ModelAndView list() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", as.getBoards());
		
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO user, HttpSession session) {
		
		user = as.login(user);
		
		if (user != null) {
			session.setAttribute("user", user);
		}
		 
		return "redirect:/board/list";
	}
	
	@GetMapping("/myPage")
	public void myPage() {}
	
	@PostMapping("/myPage")
	public String myPage(AccountVO input) {
		
		as.update(input);
		
		return "redirect:/account/logout";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public String signUp(AccountVO input) {
		
		as.addAccount(input);
		
		return "redirect:/account/login";
	}
	
	@GetMapping("/newPw")
	public void newPw() {}
	
	@PostMapping("/newPw")
	public ModelAndView newPw(String userid, String email) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("newPw",as.nPw(userid,email));
		
		return mav;
	}
	
	
}
