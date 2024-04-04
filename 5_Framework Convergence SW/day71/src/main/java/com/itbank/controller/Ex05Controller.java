package com.itbank.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.PersonVO;

@Controller
@RequestMapping("/ex05")
public class Ex05Controller {

	String msg = "";
	
	@GetMapping				// /WEB-INF/views/ex05.jsp
	public void ex05() {
		
	}
	
	@PostMapping
	public String ex05(Model model, @RequestParam Map<String, Object> map) {
		// 컨트롤러 메서드 파라미터에서 Map은 여러 용도로 사용되는데
		// 요청 파라미터는 어노테이션을 붙이지 않으면 파라미터를 받을 수 없다
		
		
		
		map.forEach((String k, Object v) -> {
			msg += (k + " : " + v + " ");
		});
		
		model.addAttribute("msg", msg);
		
		
		
		return "ex05_result";
	}
	
	@GetMapping("/test1")
	public String ex06() {
		
		return "ex06";
	}
	
	@PostMapping("/test1")
	public ModelAndView ex06(PersonVO vo) {
		// Model과 View를 한번에 지정 가능한 객체
		ModelAndView mav = new ModelAndView();
		
		String msg = "불합격";
		
		if (vo.getScore() >= 600) {
			msg = "합격";
		}
		
		mav.addObject("msg", msg);
		mav.setViewName("ex06_result");
		
		
		
		return mav;
	}
}
