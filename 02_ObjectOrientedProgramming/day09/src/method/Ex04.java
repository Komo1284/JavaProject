package method;

/*
	메서드 오버로딩 (overloading)
	- 같은 이름의 메서드를 여러개 작성하는 기법
	
	규칙)
	1. 메서드 이름 동일해야 한다
	2. 매개변수 형태가 달라야 한다
	3. 반환형은 관계 없다
*/

public class Ex04 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static int adder(int n) {
		return 100 + n;
	}
	
	static double adder(double n) {
		return 3.14 + n;
	}
	
	static int adder() {
		return 100 + 200;
	}
	
	public static void main(String[] args) {
		
		System.out.println("adder(5, 6) = " + adder(5,6));
		System.out.println("adder(5) = " + adder(5)); 
		System.out.println("adder(5.0) = " + adder(5.0)); 
		System.out.println("adder() = " + adder());
	}
}
