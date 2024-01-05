package varialbe;

/*
	변수 종류
	1. 원시 타입
	- boolean, char, byte, short, int, long, float, double
	- 위 8가지만 가장 기본이 되는 원시 타입이다.
	- 변수에 직접 데이터를 저장
	
	2. 참조 타입
	- 위 8가지를 제외한 모두
	- 배열, 클래스 등
	- 다른 곳의 데이터를 가리킨다.
	
	*코딩에서 참조(reference)란 어떠한 대상을 가리키는 것을 의미
 */

public class Ex06 {
	public static void main(String[] args) {
		// 원시 타입
		int n = 10;
		
		// 참조 타입(*아래는 java의 배열이다)
		int[] arr = new int[] {10, 20, 30};
		
		System.out.println("n = " + n);
		System.out.println("arr = " + arr);
		
		// *이 코드는 꼭 pythontutor.com에서 그림으로 확인하자!!!
	}
}
