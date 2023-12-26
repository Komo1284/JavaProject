package loop;

import java.util.Scanner;

// 1. n x n 별찍기
// 2. 직각 삼각형
// 3. 2번을 위아래 반전
// 4. 2번을 좌우반전
// 5. 4번을 위아래 반전

public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 >> ");
		int n = sc.nextInt();
		
		//1)
		System.out.println("1번문제");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//2)
		System.out.println("2번문제");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//3)
		System.out.println("3번문제");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//4)
		System.out.println("4번문제");
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=1; j--) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		//5)
		System.out.println("5번문제");
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >=1; j--) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
