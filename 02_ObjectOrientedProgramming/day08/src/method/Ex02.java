package method;

/*
	지역 변수
	- 특정 영역에서 생성된 변수
	- 해당 영역이 끝나면 메모리에서 제거 된다
	
	* 서로 다른 지역 변수는 이름이 같아도 다른 변수이다
*/

public class Ex02 {
	
	static void test(int n) {
		n += 5;
	}
	
	public static void main(String[] args) {
		int n = 10;
		
		test(n);
		System.out.println("n = " + n);
	}
}
