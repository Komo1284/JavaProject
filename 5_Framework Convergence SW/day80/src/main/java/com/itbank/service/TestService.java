package com.itbank.service;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class TestService {

	
	public Set<Integer> lotto() {
		
		TreeSet<Integer> lotto = new TreeSet<>();
		Random ran = new Random();
		
		while (lotto.size() != 6) {
			lotto.add(ran.nextInt(45) + 1);
		}
		
		return lotto;
	}

	public void firstAOP() {
		System.out.println("service 메서드 호출~");
		
	}
}
