package loop;

/*
 * 지역 변수 (local variable)
 * 특정 영역에서 선언된 변수를 의미
 * 해당 영역에서 생성되며 해당 영역이 끝나면 메모리에서 제거된다
 * 즉, 해당 영역에서만 사용 가능
 */

public class Ex05 {
	
	
	public static void main(String[] args) {
		
		// 1. for문의 지역 변수
		
		for (int i = 1; i<=3; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
		
		// System.out.println("반복 후 i = " + i);
		// - i 는 for문에서 생성된 지역 변수
		// - 즉, for문이 끝나고 나면 제거되고 없다
		
		// 2. main의 지역 변수
		int i;
		
		for (i = 1; i <=3; i++	) {
			System.out.println(i+ " : Hello World!!!");
		}
		System.out.println("반복 후 i = " + i);
		
	}
}
