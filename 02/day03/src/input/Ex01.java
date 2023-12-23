package input;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 표준 입력 : 콘솔로 부터 사용자의 입력 받아서 프로그램에서 처리
		// System.in : 표준 입력 객체
		
		System.out.print("키보드 하나 입력 : ");
		
		// read() : 키보드 값 하나를 정수로 받아서 반환
		int n = System.in.read();
		
		System.out.println("n = " + n);
	}
}
