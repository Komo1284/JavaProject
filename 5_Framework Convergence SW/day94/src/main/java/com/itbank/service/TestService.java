package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.TestDAO;

@Service
public class TestService {

	@Autowired
	private TestDAO dao;
	
	public Object total(int n) {
		
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		
		return result;
	}

	public String test() {
		return dao.test();
	}
	
	
}
