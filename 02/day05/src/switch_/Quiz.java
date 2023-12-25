package switch_;

import java.util.Scanner;

/*
	control.Quiz2의 문제를
	switch로 변경해서 다시 풀어보세요
*/

public class Quiz {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,total;
		double avg;
		char grade;
		System.out.print("성적 3개를 입력해주세요>> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		total = n1 + n2 + n3;
		avg = total / 3.0;
		
		int rank = (int)avg/10;
		switch(rank) {
		case 10: case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
			
		}
		
		
		
		System.out.printf("총합 : %d점, 평균 : %.2f점\n",total, avg);
		System.out.printf("등급 : %c",grade);
		
		sc.close();
	}
}
