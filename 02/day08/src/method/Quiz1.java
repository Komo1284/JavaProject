package method;

/*
	1. 전달한 두 정수를 비교 후 큰 수를 반환
	단, 같으면 아무거나
	
	2. 전달한 실수(= 반지름)의 원넓이를 반환
	단, pi = 3.14로 계산
	
	3. 전달한 정수의 절대값을 반환
	
	4. 전달한 정수의 1 ~ n까지의 합계를 반환
	
	5. 전달한 정수가 소수인지 반환
*/

public class Quiz1 {
	
	static int compare(int n1, int n2) {
		int max = n1;
		if(n2>n1) {
			max = n2;
		}
		return max;
	}
	
	static double circle(double n1) {
		double cir = n1*n1*3.14;
		return cir;
	}
	
	static int absolute(int n1) {
		int result = n1;
		if(n1 < 0) {
			result = n1 * -1;
		}
		return result;
	}
	
	static int total(int n1) {
		int sum = 0;
		for (int i = 1; i <= n1; i++) {
			sum += i;
		}
		return sum;
	}
	
	static boolean isPrime(int n1) {
		int count = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				count++;
			}
		}
		if(count == 2) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		// 1번)
		int n = compare(5,3);
		System.out.println(n);
		
		// 2번)
		double cir = circle(3.5);
		System.out.println(cir);
		
		// 3번)
		int abs = absolute(-5);
		System.out.println(abs);
		
		// 4번)
		int sum = total(10);
		System.out.println(sum);
		
		// 5번)
		boolean prime = isPrime(7);
		System.out.println(prime);
		
		// 6번) 6번의 메서드를 활용해서 1~1000 사이의 소수를 모두 출력
		
		for(int i = 1; i <= 1000; i++) {
			if(isPrime(i)) {
				System.out.printf("%d\n", i);
			}
		}
	}
}
