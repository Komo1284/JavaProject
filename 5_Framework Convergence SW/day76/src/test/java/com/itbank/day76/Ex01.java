package com.itbank.day76;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Ex01 {
	
	// 호출해서 사용할 메서드는 @Test 붙이지 않는다
	private int total(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	@Test
	public void run1() {
		int result = total(10);
		
		// System.out.println("result = " + result);
		
		assertEquals("total Test", 54, result);
		// (메세지, 기대값, 결과값)
		// - 기대값과 결과값이 같으면 성공
		// - 다르면 failure를 발생
	}
}
