package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열 처리를 지원하는 String 클래스 char의 배열로 이루어짐
		//			   01234 ( = index, 순서 번호)
		String word = "Hello";
		
		System.out.println("word = " + word);
		System.out.println("word[0] = " + word.charAt(0));
		System.out.println("word[4] = " + word.charAt(4));
		
		//System.out.println("word[5] = " + word.charAt(5));
		// - 범위를 초과하는 참조는 에러
		
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("\n문자 하나 입력 :");
		ch = sc.next().charAt(0);
		
		System.out.println("ch = " + ch);
		
		sc.close();
	}
}
