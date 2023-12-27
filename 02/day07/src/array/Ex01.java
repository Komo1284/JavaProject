package array;

/*
	변수 : 값을 저장하는 공간. 단일 값
	
	배열 : 같은 자료형으로 '메모리상 연속'된 공간. 복수 값
*/

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		
		int[] arr = new int[] {10,20,30};
		
		// * 일반 타입의 변수는 출력시 저장된 값이 출력되며
		System.out.println("n = " + n);
		
		//*참조 타입(배열, 객체)의 병수는 출력시 해시 코드가 출력된다
		//*해시코드는 자바 프로그램에서 객체를 구분하기 위한 값이다.
		System.out.println("arr = " + arr + "\n");
		
		// 해시코드를 가진 참조 변수와 index의 조합으로 배열의 데이터에 접근 가능
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
	}
}
