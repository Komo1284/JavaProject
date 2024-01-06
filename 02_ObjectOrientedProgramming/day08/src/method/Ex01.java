package method;

/*
	메서드의 타입
	1. 반환값이 없는 메서드 : void형 메서드
	2. 반환값이 있는 메서드 : 자료형 메서드
	
	* 반환값
	- 메서드 실행 후 돌려주는 값(= 데이터)
	- 즉, 메서드 실행 결과값을 의미
*/

public class Ex01 {
	
	// 반환값이 없는 메서드 ( = void)
	static void adder1(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n\n", n1, n2, sum);
	}
	
	// 반환값이 있는 메서드 (= int)
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	
	public static void main(String[] args) {
		// 1. void형 메서드는 반환값이 없다 -> 그냥 이름만 호출해서 쓴다
		adder1(5, 6);
		
		// 2. 자료형 메서드는 반환값이 있다
		// - 따라서, 같은 자료형 변수에 저장 받거나
		int result = adder2(5,6);
		
		System.out.println("result = " + result);
		System.out.println("result * 2 = " + result * 2);
		
		// - 다른 메서드의 전달값으로 바로 사용한다
		System.out.println("\nadder2(3, 1) = " + adder2(3, 1));
		
		// *연습) 아래 결과값을 유추
		int n = adder2(adder2(3, 7), adder2(7,6));
		
		System.out.println("n = " + n);		//?
		// 과정 int n = adder2(10,13);
		// int n = 23
	}
}
