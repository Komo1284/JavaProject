package com.itbank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itbank.model.BoardDAO;

@SpringBootTest
class Day95ApplicationTests {

	@Autowired
	private BoardDAO dao;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void sqlTest() {
		String ver = dao.test();
		System.out.println(ver);
	}

}
