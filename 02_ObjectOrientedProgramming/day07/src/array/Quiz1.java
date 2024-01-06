package array;

import java.util.Arrays;
import java.util.Scanner;

/*
	1. 학생 5명의 점수를 저장할 정수형 배열을 선언
	
	2. 반복과 입력을 활용해서 배열에 순서대로학생 점수를 입력 받는다
	
	3. 입력 받은 정수를 일렬로 모두 출력	
	
	4. 학생들의 점수 합계/평균을 출력
	
	5. 1등의 점수와 꼴등의 점수를 출력
*/

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0;
		double avg;
		int max = 0, min = 100;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 학생의 점수를 입력하세요 >> ", i+1);
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("학생들의 점수 : " + Arrays.toString(arr));
		avg = (double)sum / arr.length;
		System.out.printf("합계 : %d, 평균 : %.2f\n", sum, avg);
		
		System.out.printf("1등의 점수 : %d, 꼴등의 점수 : %d", max, min);
		
		sc.close();
		
		
	}
}
