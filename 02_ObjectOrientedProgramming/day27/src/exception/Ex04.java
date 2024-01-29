package exception;

import java.util.Scanner;

// 1. throws : 예외 전가
// 2. throw  : 개발자가 예외를 직접 발생

public class Ex04 {
	static int input(Scanner sc) throws Exception {
		int n;
		
		System.out.print("양수 입력: ");
		n = sc.nextInt();
		
		if (n < 0) {
			throw new Exception("양수가 아닙니다");
		}
		
		return n;
	}
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int n = input(sc);
		
		System.out.println("n = " + n);
		
		sc.close();
	}
}
