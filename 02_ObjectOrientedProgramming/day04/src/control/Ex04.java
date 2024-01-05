package control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 보조 조건문 else if
		// - 다중 조건을 처리하기 위한 구문
		// - 보조이므로 단독으로 사용 불가능
		
		Scanner sc = new Scanner(System.in);
		String adult = "";
		int age;
		
		System.out.print("나이 입력: ");
		age = sc.nextInt();
		
		if (age >= 19) {
			adult = "성인";
		}else if (age >= 16) {
			adult = "고등학생";
		}else if (age >= 13) {
			adult = "중학생";
		}else {
			adult = "초등학생 이하";
		}
		
		adult += " 입니다~";
		
		System.out.println(adult);
		sc.close();
	}
}
