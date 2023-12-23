package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : 산술 + 대입
		int n = 10;
		
		n += 5; 	// n = n + 5;
		System.out.println("n = " + n);
		
		n -= 3;
		System.out.println("n = " + n);
		
		n *= 2;
		System.out.println("n = " + n);
		
		n /= 3;
		System.out.println("n = " + n);
		
		n %= 3;
		System.out.println("n = " + n + "\n");
		
		
		int a = 3, b = 7, c = 1;
		
		a += b -= c *= 2;
		
		System.out.println("a = " + a);		// 8
		System.out.println("b = " + b);		// 5
		System.out.println("c = " + c);		// 2
	
	}
}
