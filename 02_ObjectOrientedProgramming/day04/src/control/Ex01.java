package control;

import java.util.Scanner;

/*
	제어문 : 프로그램의 흐름을 제어하는 구문
	1. 조건문 : 참/거짓에 따라서 코드를 분기
	2. 선택문 : 선택한 값에 따라서 코드를 분기
	3. 반복문 : 참/거짓에 따라서 코드를 루프
	4. 보조 제어문 : 위의 구문을 보조하는 구문
*/

public class Ex01 {
	public static void main(String[] args) {
		// 조건문 if : 조건식이 참이면 종속문을 수행
		// *종속문 : 특정영역에 포함된 구문. 
		// - 보통{} 내에 작성됨
		// - 종속문이 한 줄인 경우엔 {}를 생략하기도 함
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age >= 19) {
			System.out.print("성인");
		}
		
		System.out.println("입니다.");
		sc.close();
	}
}
