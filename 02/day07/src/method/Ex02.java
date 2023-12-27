package method;

public class Ex02 {
	
	static void hello(int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(7);
	}
}
