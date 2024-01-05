package loop;

public class Ex06 {
	public static void main(String[] args) {
		// 보조 제어문 break
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 보조 제어문 continue
		for(int i =1; i<=10; i++) {
			if (i == 5) {
				continue;	// 제어문을 '즉시' 처음으로
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
