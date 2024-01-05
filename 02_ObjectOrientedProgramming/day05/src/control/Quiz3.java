package control;

import java.util.Scanner;

/*
	엘레베이터 호출)
	현재 건물에 엘레베이터 3대가 있다
	각 엘레베이터는 a5층 b7층 c9층에 머물러 있다
	이때, 현재 층을 입력 받아서 가장 가까운 엘레베이터를 호출한다
	만약, 동일한 층 수 차이면 앞의 엘레베이터를 호출한다
*/

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 5, b = 7, c = 9,now;
		
		System.out.print("현재 층수를 입력하세요>> ");
		now = sc.nextInt();
		
		int disA = a - now;
		int disB = b - now;
		int disC = c - now;
		
		if(disA < 0) disA *= -1;
		if(disB < 0) disB *= -1;
		if(disC < 0) disC *= -1;
		
		int min = disA;
		char name = 'A';
		
		if(min > disB) {
			min = disB;
			name = 'B'; 
		}
		if(min > disC) {
			min = disC;
			name = 'C';
		}
		
		
		
		System.out.printf("%c호를 호출합니다.",name);
		sc.close();
	}
}
