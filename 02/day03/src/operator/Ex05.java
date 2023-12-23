package operator;

public class Ex05 {
	public static void main(String[] args) {
		// 증감 연산자 : 피연산자의 값을 1증가 혹은 1감소
		int n = 10;
		
		++n;	// n += 1과 동일하지만 증감이 더 효율적임
		System.out.println("n = " + n);
		
		--n;	// 전치 : 연산자가 앞에 붙은 경우
		System.out.println("n = " + n);
		
		n++;	// 후치 : 연산자가 뒤에 붙은 경우
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n + "\n");
		
		
		// 기본적으로 전치 후치는 차이가 없지만
		// 다른 연산과 같이 사용시 우선순위가 달라진다
		int n1 = 10, n2, n3;
		
		n2 = ++n1;	// 전치 : 증감 후 다른 연산을 수행
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		n1 = 10;
		
		n3 = n1++;	// 후치 : 다른 연산 후 증감을 수행
		System.out.printf("n1 = %d, n3 = %d\n\n", n1, n3);
		
		
		// 연습) 전치 > 산술 > 대입 > 후치
		int a = 7, b = 3, c = 6, d;
		
		d = ++a + b-- + c++;
//		d =  8  +  3  +  6
//				   2     7
		
		System.out.println("a = " + a);		// 8
		System.out.println("b = " + b);		// 2
		System.out.println("c = " + c);		// 7
		System.out.println("d = " + d);		// 17
		
	}
}
