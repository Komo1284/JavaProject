package loop;

import java.util.Scanner;

/*
	연습)
	1. main의 코드를 반복으로 줄여보세요
	2. 1번을 완료 후 입력문으로 변경해서 입력한 구구단이 출력되게 한다.
	3. 그 아래 반복을 하나 더 작성해서 역순으로 출력되게 한다 (x9~ x1)
*/

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("계산할 구구단 단수를 입력하시오 >> ");
		n = sc.nextInt();
		
		int i = 1;
		while (i <= 9) {
			System.out.printf("%d x %d = %d\n", n, i, (n*i));
			i++;
		}
		
		System.out.println();
		
		i = 9;
		while (i > 0) {
			System.out.printf("%d x %d = %d\n", n, i, (n*i));
			i--;
		}
		sc.close();
	}
}
