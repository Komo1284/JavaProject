package static_.other;

public class Function {
	public static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static int total(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int absolute(int n) {
		if (n < 0) {
			return -n;
		}else {
			return n;
		}
	}
	
	public static void selectSort(int[] arr	) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}else {
			return false;
		}
	}
}
