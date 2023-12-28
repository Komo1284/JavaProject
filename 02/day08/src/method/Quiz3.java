package method;

import java.util.Random;

/*
	*main의 배열을 활용해서 아래 문제를 풀어주세요
	1. 배열에 1 ~ 50 사이의 정수를 랜덤으로 채운다
	
	2. 배열의 모든 요소를 문자열로 반환하는 메서드
*/

public class Quiz3 {
	
	static void inputArr(int[] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			int n = ran.nextInt(50)+1;
			arr[i] = n;
		}
	}
	
	static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int big;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					big = arr[i];
					arr[i] = arr[j];
					arr[j] = big;
				}
			}
		}
	}
	
	static String printArr(int[] arr){
		String result = "[";
		int i;
		for(i = 0; i < arr.length-1; i++) {
			result += arr[i]+ ", ";
		}
		result += arr[i] + "]";
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		
		
		inputArr(arr);
		System.out.println("arr = " + printArr(arr));
		
		// 선택 정렬
		selectSort(arr);
		System.out.println("arr = " + printArr(arr));
		
	}
}
