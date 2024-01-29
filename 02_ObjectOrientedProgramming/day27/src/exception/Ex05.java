package exception;

import java.util.Scanner;

// 개발자가 직접 예외 클래스를 작성해서 사용도 가능하다
// - 예외 클래스로 사용하려면 Exception을 꼭 상속 받아야 한다
// - 하지만, Java는 이미 만들어진 예외 클래스가 많아서 직접 만들어 사용하는 경우는 적다

class PositiveException extends Exception {

	private static final long serialVersionUID = 1620550881108670008L;
	
	public PositiveException(String message) {
		super(message);
	}
}

public class Ex05 {
	static int input(Scanner sc) throws PositiveException {
		int n;
		
		System.out.print("양수 입력: ");
		n = sc.nextInt();
		
		if (n < 0) {
			throw new PositiveException("now positive");
		}
		
		return n;
	}
	
	public static void main(String[] args) throws PositiveException {
		Scanner sc = new Scanner(System.in);
		int n = input(sc);
		
		System.out.println("n = " + n);
	}
}
