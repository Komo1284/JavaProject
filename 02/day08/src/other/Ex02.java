package other;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// Random을 좀 더 쉽게 제공하는 클래스
		Random ran = new Random();
		
		int n = ran.nextInt();	// int 범위 내에서 정수를 랜덤으로 반환
		System.out.println(n);
		
		// 연습) 11~35 사이 랜덤 정수 3개를 출력
		
		for(int i = 1; i <= 3; i++) {
			n = ran.nextInt(25)+11;
			System.out.println(n);
		}
	}
}
