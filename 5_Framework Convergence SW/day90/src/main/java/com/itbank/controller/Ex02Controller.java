package com.itbank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.vo.PersonVO;

@RestController		// Controller + ResponseBody
@RequestMapping("/ex02")
public class Ex02Controller {

	@GetMapping
	public String get() {
		return "Hello Spring!!!";
	}
	
	@GetMapping("/person")
	public PersonVO getPerson() {
		return new PersonVO("홍길동", 23);
	}
	
	@GetMapping("/persons1")
	public List<PersonVO> getPersons1() {
		List<PersonVO> list = new ArrayList<PersonVO>();
		
		list.add(new PersonVO("홍길동", 33));
		list.add(new PersonVO("이민지", 21));
		list.add(new PersonVO("김수철", 54));
		
		return list;
	}
	
	@GetMapping("/persons2")
	public Map<String, PersonVO> getPersons2() {
		
		Map<String, PersonVO> map = new HashMap<>();
		
		map.put("1", new PersonVO("홍길동",33));
		map.put("2", new PersonVO("김민지",21));
		map.put("3", new PersonVO("박수철",42));
		
		return map;
	}
	
	
	
	@GetMapping("/student")
	public Map<String, Object> getStudent() {
		Map<String, Object> stu = new HashMap<>();
		
		stu.put("name", "김민수");
		stu.put("age", 16);
		stu.put("score", 88);
		stu.put("gender", "남");
		
		return stu;
	}
	
	
}
