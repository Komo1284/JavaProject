package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	@ResponseBody // view가 아닌 데이터 그대로 반환
	@GetMapping("/ex01")
	public String ex01() {
		return "Hello World";
	}
	
}
