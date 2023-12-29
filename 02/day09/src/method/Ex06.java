package method;

public class Ex06 {
	
	static int total(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + total(n -1);
	}
	
	public static void main(String[] args) {
		int sum = total(1000);
		
		System.out.println("sum = " + sum);
	}
}
