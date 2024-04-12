package com.itbank.day76;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Ex02 {
	
	@Autowired
	private TestService ts;

	@Test
	public void run1() {
//		System.out.println("ts = " + ts);
//		System.out.println("메서드 : " + ts.total(10));
		
		assertNotNull(ts);
		assertEquals("서비스 테스트~", 55, ts.total(10));
	}
	
	
	@Test
	public void quiz1() {
		// TestService에 로또 번호 추첨 로직을 작성 후 테스트를 해본다
		
		System.out.println(ts.lotto());
	}
}
