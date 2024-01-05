package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 대입 연산자(=) : 변수에 값을 할당하는 연산자
		// 1. 좌변은 공간, 우변은 결과값
		// 2. 항상 우변부터 수행한다
		// 3. 양변의 자료형은 일치시킨다
		
		int n = 10 + 5;		// 산술이 대입보다 우선된다
//		int n = 15;		
		
		System.out.println("n = " + n);
		
		
		int a, b, c;
		a = b = c = 30;		// 가장 우측부터 수행
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
}
