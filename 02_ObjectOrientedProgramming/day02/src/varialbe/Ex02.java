package varialbe;

/*
	형변환 : 자료형을 변환하는 방법
	1. 자동 형변환 : 서로 다른 타입을 연산시 발생
	2. 강제 형변환 : 개발자가 지정한 타입으로 변경
	
	* 강제 형변환은 변수를 배워야 할 수 있음
	
*/

public class Ex02 {

	public static void main(String[] args) {
		// 문자열+ 문자열 (= 타입 일치, 자동 형변환x)
		System.out.println("10"+"5");
		
		// 문자열 + 정수 (= 타입 불일치, 자동 형변환 발생)
		System.out.println("10"+5);
		
		// 정수 + 실수
		System.out.println(10+3.2);

	}

}
