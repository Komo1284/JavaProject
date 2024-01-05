package operator;

/*
	연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
	종류 : 산술, 대입, 증감, 비교, 논리, 조건 등
*/

public class Ex01 {
	public static void main(String[] args) {
		// 산술 연산자 : 사칙 연산을 제공
		int n = 10;
		
		System.out.println("n = " + n);
		System.out.println("n + 5 = " + (n + 5));
		
		// ※ 산술 연산은 변수의 값을 변경하지 않는다
		System.out.println("n = " + n + "\n");
		
		System.out.println("n - 5 = " + (n - 5));
		System.out.println("n * 2 = " + n * 2);
		System.out.println("n / 3 = " + n / 3);
		System.out.println("n / 3.0 = " + n / 3.0);
		System.out.println("n % 3 = " + n % 3);
		
		// 우선순위 테스트
		// 1. %, /, *는 동일한 우선순위
		// 2. +, -는 동일한 우선순위
		System.out.println(6 + 7 - 2 / 2 * 3);
		System.out.println(41 % 3 / 5);
	}
}
