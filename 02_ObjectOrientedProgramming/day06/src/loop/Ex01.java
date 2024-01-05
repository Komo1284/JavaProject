package loop;

import java.util.Scanner;

// while문 순서)
// 조건 -> 종속문

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		
		while (n != 0) {
			System.out.print("정수 입력 (0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		}
		
		sc.close();
	}
}
