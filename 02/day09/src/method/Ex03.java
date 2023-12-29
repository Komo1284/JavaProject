package method;

import java.util.Scanner;

/*
	복잡도 : 프로그램의 성능을 판별하는 척도
	1. 시간 복잡도 : 프로그램 수행 시간을 계산
	2. 공간 복잡도 : 프로그램에서 사용한 메모리 양을 계산
	
	* 보통 복잡도라고 하면 시간 복잡도를 의미한다
*/

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		// 프로그램 시작 시간
		long start = System.currentTimeMillis();
		System.out.println("start = " + start);
		
		System.out.print("1초 후 정수 입력: ");
		n = sc.nextInt();
		
		System.out.println("n = " + n);
		
		sc.close();
		
		// 프로그램 종료 시간
		long end = System.currentTimeMillis();
		
		// 종료 - 시작 == 소요시간
		System.out.println("소요 시간 : " + (end - start) / 1000.0);
	}
}
