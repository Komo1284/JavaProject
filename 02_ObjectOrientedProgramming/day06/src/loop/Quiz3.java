package loop;

import java.util.Scanner;

/*
	*아래 문제들은 for문을 사용해서 풀어주세요
*/

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		// 1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
		
		System.out.print("정수를 입력 받아서 1 ~ n까지 일렬로 출력 >> ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		// 2. 정수를 입력 받아서 약수를 모두 출력
		
		System.out.print("정수를 입력 받아서 약수를 모두 출력 >> ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
		
		// 3. 정수를 입력 받아서 소수인지 판별
		
		System.out.print("정수를 입력 받아서 소수인지 판별 >> ");
		n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum++;
			}
		}
		if (sum == 2) {
			System.out.println(n + " 은(는) 소수 입니다.");
		}else {
			System.out.println(n + " 은(는) 소수가 아닙니다.");
		}
		
		sc.close();
		
	}
}
