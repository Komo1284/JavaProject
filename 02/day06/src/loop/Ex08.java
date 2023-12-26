package loop;

/*
	1. 구구단 2단을 단일 반복으로 출력
	단, x1 ~ x9까지만
	
	2. 1번을 중첩 반복으로 변경 후 구구단 2단을 8번 출력
	
	3. 2번을 변경해서 구구단 2단 ~ 9단까지 출력
	
	4. 역순으로 출력 (9 x 9 ~ 2 x 1까지)
*/

public class Ex08 {
	public static void main(String[] args) {
		
		//1번문제
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n",2,i,i*2);
		}
		System.out.println();
		
		//2번문제
		for(int j = 1; j <= 8; j++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n",2,i,i*2);
			}
			System.out.println();
		}
		
		
		//3번문제
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		
		//4번문제
		for(int i = 9; i >= 2; i--) {
			for(int j = 9; j >= 1; j--) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}
