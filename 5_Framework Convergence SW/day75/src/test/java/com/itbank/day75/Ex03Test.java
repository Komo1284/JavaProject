package com.itbank.day75;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Ex03Test {

	private int[] arr1, arr2;
	private String str1, str2;
	
	@Before
	public void setVariable() {
		arr1 = new int[] {10,20,30};
		arr2 = new int[] {10,20,30};
		
		str1 = "Hello";
		str2 = new String("Hello");
	}
	
	@Test
	public void run1() {
		assertArrayEquals(arr1, arr2);	// 동일한 배열이면 성공
		System.out.println("실행 완료");	// 다른 배열이면 failure를 발생
	}
	
	@Test
	public void run2() {
		assertEquals(str1, str2);
	}
	
}
