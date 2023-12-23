package operator;

public class Ex06 {
	public static void main(String[] args) {
		// 비교 연산자 : 데이터의 대소 관계를 비교하는 연산자
		// - 비교의 결과는 boolean 타입 (true/false)
		
		// ※ 전치 > 산술 > 비교 > 대입 > 후치
		
		int n = 10;
		
		System.out.println("n > 10 결과 : " + (n > 10));
		System.out.println("n >= 10 결과 : " + (n >= 10));
		System.out.println("n < 20 결과 : " + (n < 20));
		System.out.println("n <= 20 결과 : " + (n <= 20));
		System.out.println("n == 10 결과 : " + (n == 10));		// 같으면 참
		System.out.println("n != 10 결과 : " + (n != 10));		// 다르면 참
		
		
		boolean result = n == 11;
//		boolean result = false;
		
		System.out.println("\nresult = " + result);
	}
}
