package varialbe;

// 리터럴 : 즉시 사용되는 값을 의미
// - 변수에 저장되지 않고 곧장 사용되는 값
// - 리터럴은 각 타입의 대표타입으로 크기가 결정된다.

public class Ex05 {
	public static void main(String[] args) {
		// 다양한 타입의 변수를 작성해 보자
		boolean bo = true;
		char ch = 'A';
		byte by = 127;
		short sh = 32767;
		int it =  2000000000;
		long lo = 3000000000l;	 // L은 리터럴을 long으로 잡으라는 의미
		float fl = 1.12345678901234f;	 // F는 리터럴을 float으로 잡으라는 의미
		double db = 1.12345678901234;
		
		System.out.println("bo = " + bo);
		System.out.println("ch = " + ch);
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("it = " + it);
		System.out.println("lo = " + lo);
		System.out.println("fl = " + fl);
		System.out.println("db = " + db);
	}
}
