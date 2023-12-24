package control;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 보조 조건문 else : 위의 조건이 거짓이면 수행
		// - 보조이므로 단독으로 사용 불가능. if가 있어야함
		
		Scanner sc = new Scanner(System.in);
		String adult = "";
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if(age>=19) {
			adult += "성인";
		}else {
			adult += "미성년자";
		}
		
		System.out.println(adult + " 입니다");
		sc.close();
	}
	
}
