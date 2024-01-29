package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	정수를 입력 받아서 출력하는 프로그램을 작성하세요
	
	단, 정수가 아닌 데이터가 입력되면 다시 입력 받을 수 있게 구성하세요
	
	※ 힌트 : buffer가 뭐였더라?
*/

public class Quiz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			try{
				System.out.print("정수 입력: ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				break;
			}catch(InputMismatchException e) {
				System.err.println("정수가 아닙니다. 다시 입력해주세요");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
