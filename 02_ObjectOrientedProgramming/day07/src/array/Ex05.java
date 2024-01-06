package array;

import java.util.Arrays;

/*
	1. 크기가 4인 실수형 배열을 생성한다.
	
	2. 1번의 실수에 아무 값이나 채운다
	
	3. 배열 요소 모두 일렬로 출력
	
	4. 배열 요소 전체의 합계/평균을 출력
*/

public class Ex05 {
	public static void main(String[] args) {
		double arr[] = new double[4];
		arr[1] = 10.2;
		arr[2] = 4.3;
		arr[0] = 2.2;
		arr[3] = 1.7;
		
		System.out.println("arr[] = " + Arrays.toString(arr));
		
		double sum = 0;
		for(double n : arr) {
			sum += n;
		}
		double avg = sum/arr.length;
		
		System.out.printf("총합 : %.1f, 평균 : %.2f",sum,avg);
		
	}
}
