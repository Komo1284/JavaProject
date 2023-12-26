package loop;

import java.util.Scanner;

// do while문 순서)
// 종속문 -> 조건

// *종속문을 먼저 수행하기 떄문에 '무조건 한번'은 실행된다

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("정수 입력 (0 : 종료)");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
			
		} while(n != 0);
		sc.close();
	}
}
