package method;

/*
	1. 재귀 함수를 이용해서 factorial을 구현(= 누적곱)
	
	2. 재귀 함수를 이용해서 피보나치 수열을 구현
	
	*피보나치 수열
	- 인접한 두 항의 합이 다음 항의 값이 된다
	- 재귀식 : f(n) = f(n-1) + f(n -2)
	- 단, f(1) = f(2) = 1이다
	
	ex)
	1 1 2 3 5 8 13 21 34 55 89 ...
*/

public class Quiz3 {
	
	static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n * factorial(n -1);
	}
	
	static int fibonacci(int n) {
		int result = 0;
		
		if (n == 1) {
			result = 1;
		}else if (n == 2){
			result = 1;
		}else if (n >= 3) {
			result = fibonacci(n -1) + fibonacci(n -2);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int n = factorial(5);
		System.out.println("n팩토리얼 : " + n);
		
		
		int n1 = fibonacci(8);
		System.out.println(n1);
	}

}
