package com.itbank.day75;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Ex02Test {

	private static int share;
	private int num;
	
	@BeforeClass		// 테스트 클래스(Ex02Test)가 수행시 딱 한번
	public static void setShare() {
		System.out.println("BeforeClass 수행");
		share = 10;
	}
	
	@Before		// @Test들 마다 먼저 수행되는 코드
	public void setNum() {
		System.out.println("\nBefore 수행");
		num = 10;
	}
	
	@Test
	public void run1() {
		System.out.println("run1 수행");
		
		num += 2;
		share -= 2;

	}
	
	@Test
	public void run2() {
		System.out.println("run2 수행");
		
		share -= 2;
		num += 2;
		
	}

	@After		// @Test들 마다 끝난 후 수행되는 코드
	public void resultNum() {
		System.out.println("After 수행");
		
		System.out.println("num = " + num);
		System.out.println("share = " + share);
	}

	@AfterClass
	public static void resultSahare() {
		System.out.println("\nAfterClass 수행");
	}
}
