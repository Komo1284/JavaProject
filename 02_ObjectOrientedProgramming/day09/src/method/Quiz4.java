package method;

public class Quiz4 {
	
	static void hanoi(int n, char src, char sub, char dst) {
		
		if(n == 1) {
			System.out.printf("원판 %d %c --> %c\n", n, src, dst);
			
			return;
		}
		
		hanoi(n-1, src, dst, sub);
		System.out.printf("원판 %d %c --> %c\n", n, src, dst);
		hanoi(n-1, sub, src, dst);
		
	}
	
	public static void main(String[] args) {
		// 원판 1개 - 제일 구현 쉬움
		hanoi(1, 'A', 'B', 'C');
		System.out.println();
		
		// 원판 2개 - 고민이 조금 필요. 구현하면 나머지도 해결됨
		hanoi(2, 'A', 'B', 'C');
		System.out.println();
		
		// 원판 3개
		hanoi(3, 'A', 'B', 'C');
	}
}
