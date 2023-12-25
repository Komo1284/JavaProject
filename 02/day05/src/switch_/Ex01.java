package switch_;

import java.util.Scanner;
/*
 	선택문 switch
 	- 값에 따라서 코드를 분기
 	- 값은 정수와 문자열만 사용 가능
 	
 	*switch문으로 작성된 구문은 전부 if로 구현 가능
 	단, 반대는 거의 불가능
 	
 	결론)
 	1. 단일 값 조건 처리는 if보단 switch가 빠르다
 	2. 범위 조건 처리는 switch가 거의 불가능하니 if로 처리하는게 수월하다
*/

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("입력 (1~3) ");
		n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("1번 선택"); break;
		case 2:
			System.out.println("2번 선택"); break;
		case 3:
			System.out.println("3번 선택"); break;
		default:
			System.out.println("잘못된 입력 입니다.");	
		}
		
		System.out.println("\n프로그램 종료");
		sc.close();
	}
}
