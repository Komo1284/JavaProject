package control;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 중첩 조건문
		// - 조건문 안에 또 조건문을 구성하는 방식
		// - 세부 조건을  판별시 사용
		// - 단, 남용시 가독성을 떨어뜨리므로 주의
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("짝수");
			
			if (n % 3 == 0) {
				System.out.println("짝수이며 3의 배수");
			}
		}else {
			System.out.println("홀수");
		}
		
		sc.close();
	}
}
