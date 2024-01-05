package input;

import java.util.Scanner;

/*
	buffer : 데이터가 임시로 보관되는 공간
	- 데이터 전송 속도를 향상 시키기 위해 고안
	- 버퍼에서는 space와 enter가 구분자가 된다
	
	*Scanner는 데이터를 버퍼에서 읽어온다
*/

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.printf("n1 = %d, n2 = %d\n\n", n1, n2);
		
		sc.nextLine();
		// - 버퍼의 모든 데이터를 문자열로 가져온다
		// - 즉, 버퍼가 비게 된다
		
		int n3, n4;
		
		System.out.print("다시 두 정수 입력: ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d, n4 = %d\n", n3, n4);
		
		sc.close();
	}
}
