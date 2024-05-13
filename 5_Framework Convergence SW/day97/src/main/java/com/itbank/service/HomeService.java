package com.itbank.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public int total(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
}
