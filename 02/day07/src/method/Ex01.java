package method;

/*
	함수(function) : 일정 길이의 코드를 저장하고 재사용 하는 방식
	
	*메서드(method)
	- 객체가 사용하는 메서드로, 클래스 안에 선언된 함수를 의미
	- 즉, 객체 지향의 개념이 추가된 함수를 의미한다
	- java는 모든 함수가 클래스 안에서만 작성 가능하기 때문에 모두 메서드에 해당
*/

public class Ex01 {
	
	// 메서드 선언 : 실행 코드가 작성된 곳
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
