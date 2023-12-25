package control;

import java.util.Scanner;

/*
	버스 소요 시간)
	버스는 각 역 평균 이동시간이 2분이다.
	하지만 10 정거장이 넘어가면 이동시간이 4분으로 늘어나는 규칙을 가지고 있다.
	이때, 사용자에게 정거장 수를 입력 받아서 소요시간을 출력한다
	또, 60분이 넘어가면 시간/분으로 나누어 출력
	
	ex)
	1. 입력 : 5 -> 출력 : 10분
	2. 입력 : 11 -> 출력 : 24분
	
	3. 입력 : 21 -> 출력 : 1시간 4분
*/

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,time,hour,min;
		
		System.out.print("정거장의 수를 입력하시오>> ");
		n1 = sc.nextInt();
		
		if(n1 > 10) {
			time = 20+((n1-10)*4);
		}else {
			time = n1 * 2;
		}
		
		if(time >= 60) {
			hour = time/60;
			min = time % 60; 
			System.out.printf("%d시간 %d분",hour,min);
		}else {
			min = time;
			System.out.printf("%d분",min);
		}
	
		sc.close();
		
	}
}
