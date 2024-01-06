package method;

import java.util.Arrays;

/*
	참조 변수는 복사시 실제 공간이 아닌
	가리키는 방향이 복사 된다
	
*/

public class Ex03 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {10,50,40};
		int[] arr2 = arr1;
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		
		arr2[1] = 500;
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));
	}
}
