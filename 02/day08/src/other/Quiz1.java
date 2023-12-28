package other;

import java.util.Random;
import java.util.Scanner;

/*
	Up/Down 게임
	1. 프로그램 시작시 랜덤으로 숫자를 하나 뽑는다 ( 1 ~ 100 사이)
	2. 사용자에게 정수를 입력 받는다
	- 1. 정답과 일치하면 '정답'을 출력 후 프로그램 종료
	- 2. 정답 숫자가 낮으면 'Down'을 출력 후 다시 입력을 받는다
	- 3. 정답 숫자가 높으면 'Up'을 출력 후 다시 입력을 받는다
*/

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(100)+1;
		int user;
		
		System.out.print("숫자를 입력해주세요 >> ");
		user = sc.nextInt();
		
		while(user != num) {
			if(num > user) {
				System.out.println("Up");
				System.out.print("숫자를 입력해주세요 >> ");
				user = sc.nextInt();
			}else if(num < user) {
				System.out.println("Down");
				System.out.print("숫자를 입력해주세요 >> ");
				user = sc.nextInt();
			}
		}
		System.out.println("정답");
		
		sc.close();
		
	}
}
