package method;

import java.util.Random;

/*
	1. 60,000개 크기의 정수형 배열을 생성 후 랜덤으로 값을 채운다
	단, 범위는 1 ~ 120,000
	
	2. 삽입 정렬을 구현 후 소요시간을 출력
	단, 오름/내림 차순 관계 없이 아무거나
*/

public class Quiz2 {

	static void insertSort(int[] arr) {
		int tmp;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j <= i -1; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int arr[] = new int[60000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(120000)+1;
		}
		
		long start = System.currentTimeMillis();
		
		insertSort(arr);
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end-start)/1000.0 + "초");
		
	}
	
}
