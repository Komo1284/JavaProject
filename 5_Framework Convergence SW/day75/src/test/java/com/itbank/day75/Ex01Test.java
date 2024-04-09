package com.itbank.day75;

import org.junit.Test;

public class Ex01Test {
	
	@Test
	public void test1() {
		// 1. @Test 메서드를 실행할 때마다 인스턴스가 별도로 생성된다
		System.out.println(this);
		
		System.out.println("Junit 코드 테스트");
		System.out.println("기초 java에서 배우던 main 같은 느낌으로 코드를 작성하면 됨");
	}
	
	@Test
	public void test2() {
		// 2. 별도로 생성하는 이유는 테스트 환경을 완전히 분리 시키기 위해서
		// - 다른 테스트 코드에 영향을 주지 않기 위한 조치
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d : Hello Junit\n", i);
		}
		
		// 일부러 예외를 발생시키도록 함 -> 결과 : Errors로 판별
		System.out.println("10 / 0 = " + 10 / 0);
	}
}
