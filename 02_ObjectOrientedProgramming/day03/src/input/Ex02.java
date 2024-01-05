package input;

import java.lang.System;
import java.util.Scanner;

// Scanner는 import로 불러와야 사용가능
// ※ java.lang 패키지는 기본적으로 자동 import가 된다

public class Ex02 {
	public static void main(String[] args) {
		// System.in.read()만 사용해서 입력 받기에는 불편 사항이 존재
		// - 입력한 데이터를 쉽게 읽어오기 위해서 java에서 Scanner라는 클래스를 제공한다
		
		Scanner sc = new Scanner(System.in);
		// Scanner는 데이터를 읽는 도구
		// 입력은 System.in이 한다
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.println("당신의 이름은 " + name + " 입니다");
		
		sc.close();
		// Scanner는 사용 후 닫는 습관을 들이자
	}
}
