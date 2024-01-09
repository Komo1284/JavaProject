package wrapper;

import java.util.Random;
import java.util.Scanner;

/*
	1. words라는 문자열에서 랜덤으로 문자 8자리를 추출해서 문자열을 생성한다
	2. 그 후 추출한 문자열을 화면에 출력 후 사용자에게 동일한 문자열을 입력 받는다
	3. 문자열이 일치하면 인증 성공을 화면에 출력
*/

public class Quiz1 {
	public static void main(String[] args) {
		String words = "abcdefghijklmnopqrstuvwxyz";
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String word = "";
		for (int i = 0; i < 8; i++) {
			int n = ran.nextInt(words.length());
			word += words.charAt(n);
		}
		System.out.println("인증 문자 : " + word);
		System.out.print("입력 : ");
		String inp = sc.nextLine();
		
		if(inp.equals(word)) {
			System.out.println("인증 성공");
		}else {
			System.out.println("인증 실패");
		}
		
		sc.close();
		

	}
}
