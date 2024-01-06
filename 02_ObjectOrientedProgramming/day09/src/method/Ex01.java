package method;

import java.util.Arrays;

/*
	정렬 : 데이터를 순서대로 정리하는 알고리즘
	- 정렬 후 데이터 가독성 및 검색 (= 탐색) 속도 향상
	
	3대 정렬 : 실무에선 사용되지 않고 주로 알고리즘 학습용으로 사용
	1. 선택 정렬(select sort)
	2. 삽입 정렬(insert sort)
	3. 버블 정렬(bubble sort)
*/

public class Ex01 {
	
	static void insertSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i - 1; j++) {
				if(arr[i] < arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 44,25,21,36,27 };
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		
		insertSort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
	}
}
