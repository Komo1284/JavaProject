package control;

import java.util.Scanner;

/*
	USB 8GB 메모리가 1개 5,000원이다
	구매 개수를 입력 받아서 총 가격을 출력하는 프로그램을 작성
	
	단, 10개 이상시 10% 할인하고
	50개 이상시 15% 할인한 금액을 적용한다
*/

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int usb = 5000, count, total;
		
		System.out.print("USB 구매 개수? ");
		count = sc.nextInt();
		
		total = count * usb;
		
		if(count >= 50) {
			total *= 0.85;
		}else if (count >= 10) {
			total *= 0.9;
		}
		System.out.println("총 금액 : " + total + "원입니다.");
		
		sc.close();
	}
}
