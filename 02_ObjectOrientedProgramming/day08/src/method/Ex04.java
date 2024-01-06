package method;

import java.util.Arrays;

public class Ex04 {
	
	static void test(int num, int[] array) {
		num += 5;
		array[0] += 5;
	}
	
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[] {10};
		
		System.out.println("n = " + n);
		System.out.println("arr = " + Arrays.toString(arr));
		
		test(n, arr);	// n(일반 변수)	-> call by value
						// arr(참조 변수)	-> call by reference
		
		System.out.println("\nn = " + n);
		System.out.println("arr = " + Arrays.toString(arr));
	}
}
