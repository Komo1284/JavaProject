package static_;

import java.util.Arrays;

import static_.other.*;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 메서드를 구현
		// 단, Function 클래스 아래 작성할 것
		
		// 1. 1~n 까지의 합계를 반환
		int sum = Function.total(5);
		System.out.println(sum);
		
		
		// 2. 절대값을 반환하는 메서드
		int n = Function.absolute(-5);
		System.out.println(n);
		
		// 3. 배열을 오름 차순 정렬 (= 선택 정렬)
		int[] arr = new int[] { 50,10,20,40,30 };
		Function.selectSort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 4. 소수를 판별하는 메서드
		boolean prime = Function.isPrime(7);
		System.out.println(prime);
	}
}
