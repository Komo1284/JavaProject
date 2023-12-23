package operator;

// 강제 형변환
// - 개발자가 타입을 지정해서 자료형을 변환

public class Ex03 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		
		System.out.println("10 / 3 = " + 10 / 3);
		System.out.println("10 / 3.0 = " + 10 / 3.0 + "\n");
		
		
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1 / (double)n2);
		
		
		// n2는 영구적으로 변환 되었을까? 아니오
		System.out.println("\nn2 = " + n2);
	}
}
