package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.vo.PersonVO;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	
	@GetMapping("/test1")	// ex04/test1으로 요청이 들어오면 실행
	public void test1() {	// void는 요청 uri가 view 이름이 된다
							// 즉, /WEB-INF/views/ex04/test1.jsp로 포워드
	}
	
	@PostMapping("/test1")
	public String test1(Model model, PersonVO per) {

		
		model.addAttribute("per",per);
		
		return "ex04/test1_result";
		// 해당 포워드가 되는 파일에 per 정보를 문자열로 한줄로 저장해서 보낸다.
	}
}
