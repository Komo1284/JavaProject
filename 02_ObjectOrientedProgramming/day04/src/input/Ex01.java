package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("이름 입력: ");
		name = sc.next();
		
		System.out.println("당신의 이름은 " + name + "입니다");
		
		sc.close();
	}
}
