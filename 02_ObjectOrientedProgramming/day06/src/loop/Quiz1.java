package loop;

import java.util.Scanner;

/*
	1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
	
	2. 정수를 입력 받아서 n ~ 1까지 일렬로 출력
	
	3. 정수를 입력 받아서 1 ~ n까지의 합계를 출력
	
	4. 정수를 입력 받아서 1 ~ n까지의 누적 곱을 출력 
	
	5. 0을 입력 받을 때까지 정수를 계속 입력 받고 
	0을 입력받으면 이때까지 입력한 정수의 합계를 출력
	
	6. 정수를 입력 받아서 거꾸로 수를 출력
	ex) 입력 : 123 -> 출력 : 321
*/

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
		
		int n1,count;
		count = 1;
		System.out.print("1~n까지 출력할 정수를 하나 입력하세요>> ");
		n1 = sc.nextInt();
		
		while(n1 >= count) {
			System.out.printf("%d ",count);
			count ++;
		}
		
		// 2. 정수를 입력 받아서 n ~ 1까지 일렬로 출력
		
		System.out.print("\nn~1까지 출력할 정수를 하나 입력하세요>> ");
		n1 = sc.nextInt();
		
		while(n1 >= 1) {
			System.out.printf("%d ",n1);
			n1 --;
		}
		
		// 3. 정수를 입력 받아서 1 ~ n까지의 합계를 출력
		
		int sum = 0;
		System.out.print("\n1~n까지의 합계를 구할 정수를 하나 입력하세요>> ");
		n1 = sc.nextInt();
		
		count = 1;
		while(n1 >= count) {
			sum += count;
			count ++;
		}
		System.out.printf("총합 : %d ",sum);

		
		// 4. 정수를 입력 받아서 1 ~ n까지의 누적 곱을 출력 
		
		int times = 1;
		System.out.print("\n1~n까지의 누적 곱을 구할 정수를 하나 입력하세요>> ");
		n1 = sc.nextInt();
		
		count = 1;
		while(n1 >= count) {
			times *= count;
			count ++;
		}
		System.out.printf("누적 곱 : %d ",times);

		
		// 5. 0을 입력 받을 때까지 정수를 계속 입력 받고 
		// 0을 입력받으면 이때까지 입력한 정수의 합계/평균를 출력
		
		sum = 0;
		double avg;
		count = 0;
		System.out.print("\n0을 입력하기 까지의 합계를 구합니다.>> ");

		while(n1 != 0) {
			n1 = sc.nextInt();
			sum += n1;
			count++;
		}
		count--;
		avg = (double)sum /count;
		System.out.printf("총합 : %d, 평균: %.2f ",sum,avg);
		
		// 6. 정수를 입력 받아서 거꾸로 수를 출력
		// ex) 입력 : 123 -> 출력 : 321
		
		System.out.print("\n입력받은 수를 거꾸로 출력합니다.>> ");
		int n2;
		n1 = sc.nextInt();
		
		while(true) {
			n2 = n1 % 10;
			n1 = n1 / 10;
			System.out.printf("%d",n2);
			if(n1 < 10) {
				System.out.printf("%d",n1);
				break;
			}
		}
		
		sc.close();
		
		
	}
}
