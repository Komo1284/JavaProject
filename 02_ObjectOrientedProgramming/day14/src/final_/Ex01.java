package final_;

/*
	final : 마지막의
	1. 변수에 사용		: 값을 변경하지 못하게 상수로 처리	
	2. 메서드에 사용	: 오버라이드를 못하게 처리
	3. 클래스에 사용	: 더 이상 상속이 불가능하게 처리
*/

public class Ex01 {
	public static void main(String[] args) {
		// 변수
		int n = 10;
		
		// 변수를 상수로 처리
		final int fn = 10;
		System.out.println("n = " + n);
		System.out.println("fn = " + fn);
		
		n = 20;
		// fn = 20;	// 저장된 값 변경 불가능
		
		System.out.println("\nn = " + n);
		System.out.println("fn = " + fn);
		
		// 지정된 값을 변경하는 연산은 모두 불가능
//		fn += 10;
//		fn++;
		
		System.out.println("fn + 10 = " + (fn + 10));
		System.out.println("fn > 5 결과 : " + (fn > 5));
	}
}
