package loop;

import java.util.Scanner;

// 무한 반복

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("정수 입력 (0 : 종료) ");
			n = sc.nextInt();
			
			if (n == 0) {	// *if는 break의 영향을 받지 않음
				break;		// 0일때 실행되게 조건을 세팅
			}
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}
