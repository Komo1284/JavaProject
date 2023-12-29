package method;

/*
	*재귀 : 다시 되돌아 오다
	
	재귀 함수 (Recursive Method)
	- 함수 내부에서 자기 자신을 호출해서 구현 가능
	- 다양한 자료구조 구현 및 알고리즘에서 자주 사용되므로 숙지하면 좋다
*/

public class Ex05 {
	
	static void func(int n) {
		if (n == 0) {
			return;
		}
		
		func(n -1);
		
		System.out.println("n = " + n);
	}
	
	public static void main(String[] args) {
		func(5);
	}
}
