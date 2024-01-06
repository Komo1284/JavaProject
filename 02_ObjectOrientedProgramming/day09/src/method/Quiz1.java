package method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
	1. 정수를 하나 입력 받는다
	
	2. 입력 받은 정수만큼의 개수를 가지는 정수형 배열을 생성한다
	
	3. 2번에서 생성한 배열에 랜덤으로 정수를 채운다 (1 ~ 100 사이)
	
	4. 선택정렬로 오름차순 정렬 후 출력
	
	5. 삽입 정렬로 내림차순 정렬 후 출력
	
	6. 버블 정렬로 오름 차순 정렬 후 출력
*/

public class Quiz1 {
	
	static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	static void insertSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j <= i -1; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	static void bubbleSort(int[] arr) {
		while(true) {
			int count = 0;
			for(int i = 0; i < arr.length -1; i++) {
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					count++;
				}
			}
			if(count == 0) break;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("정수를 입력하세요 >> ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100)+1;
		}
		
		
		selectSort(arr);
		System.out.println("완료");
		
		insertSort(arr);
		System.out.println("완료");
		
		bubbleSort(arr);
		System.out.println("완료");
		
		sc.close();
		
	}
}
