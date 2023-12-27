package array;

import java.util.Scanner;

/*
	1. 정수를 입력 받아서 n x n 배열을 생성한다.
	
	2. 1번의 배열에 아래와 같이 채워 넣는다
	ex) 입력 : 5
	
	 1  2  3  4  5
	 6  7  8  9 10
	11 12 13 14 15
	16 17 18 19 20
	21 22 23 24 25
	
	3. n x n  배열을 하ㅏ나 더 만들어 아래와 같ㅇ ㅣ채워 넣는다
	1  6 11 16 21
	2  7 12 17 22
	3  8 13 18 23
	4  9 14 19 24
	5 10 15 20 25
*/

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int n = sc.nextInt();
		int num = 0;
		
		int arr1[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				num++;
				arr1[i][j] = num;
				System.out.printf("%2d ", arr1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%2d ", arr1[j][i]);
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
