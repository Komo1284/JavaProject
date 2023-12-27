package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 초기화 방법
		// 1. 배열을 생성하며 요소를 작성
		int[] arr1 = new int[] {10,20,30,40,50,60};
		
		// 2. 공간만 미리 생성
		int[] arr2 = new int[3];
		
		// *크기와 요소를 같이 쓰면 에러
		
		System.out.println("arr1 크기 : " + arr1.length);
		System.out.println("arr2 크기 : " + arr2.length);
		
		
		
		// *일반적으로 변수는 초기화 하지 않으면 아무런 값이 없이 출력이나 연산 불가능
		// 단, 배열은 초기화 하지 않으면 기본값으로 자동 초기화되는 특징을 가지고 있다.
		System.out.println("arr1 = " + Arrays.toString(arr1));
	
		arr2[1] = 100;
		System.out.println("arr2 = " + Arrays.toString(arr2));
		// 요소는 나중에 다시 저장 받아서 사용 가능
	}
}
