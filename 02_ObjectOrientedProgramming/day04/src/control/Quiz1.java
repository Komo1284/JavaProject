package control;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// *아래는 모두 조건문으로 풀어주세요
		// 1. 정수를 입력 받아서 절대값을 출력
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("절대값을 알고싶은 정수를 입력하시오>> ");
		a = sc.nextInt();
		
		if(a<0) {
			a *= -1;
		}
		System.out.println(a);
		
		
		// 2. 두 정수를 입력 받아서 큰 수를 출력
		int b,c,big;
		System.out.print("크기 비교를 하고싶은 정수 두개를 입력하시오>> ");
		b = sc.nextInt();
		c = sc.nextInt();
		big = b;
				
		if(b==c) {
			System.out.println("두 수의 크기가 같습니다.");
		}else {
			if(b<c) {
				big = c;
			}
		}
		System.out.println("큰 수: " + big);
		
		
		// 3. 정수를 입력 받아서 5의 배수인지 판별해서 출력
		int d;
		System.out.print("5의 배수인지 알고싶은 정수를 입력하시오>> ");
		d = sc.nextInt();
		
		if(d%5 == 0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		
		// 4. 세 정수를 입력 받아서 가장 큰 수를 출력
		int x,y,z,max;
		System.out.print("크기비교를 하고싶은 세 정수를 입력하시오>> ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		max = x;
		
		if (max < y) {
			max = y;
		}
		if (max < z) {
			max = z;
		}
		
		System.out.println("최대값 : " + max);
		sc.close();
		
		
	}
}
