package input;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 1. 이름, 국 영 수 점수를 입력 받을 변수를 선언
		// 단, 국 영 수는 정수로
		
		
		// 2. 1번의 변수에 데이터를 입력
		// 이때, 국 영 수는 한줄에 입력 받아 본다
		
		
		// 3. 결과는 아래와 같다
		// 결과)
		// 이름: 홍길동
		// 성적: 국 70, 영 80, 수 98
		// 합계: 248 (82.67)
		
		String name;
		int kor,eng,mat;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국,영,수: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.printf("\n이름: %s\n",name);
		System.out.printf("성적: 국 %d, 영 %d, 수 %d\n",kor,eng,mat);
		
		int sum = kor + eng + mat;
		double avg = (double)sum/3;
		System.out.printf("합계: %d (%.2f)",sum,avg);
		
		sc.close();
	}
}
