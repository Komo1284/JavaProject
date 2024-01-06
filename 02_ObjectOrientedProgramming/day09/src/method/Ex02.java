package method;

import java.util.Arrays;

public class Ex02 {
	
	static void bubbleSort(int[] arr) {
		while (true) {
			int count = 0;
			for(int i = 0; i < arr.length-1; i++) {
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					count ++;
				}
			}
			if(count == 0) break;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 44,25,21,36,27 };
		
		
		
		bubbleSort(arr);
		System.out.println("arr = " + Arrays.toString(arr));
		
	}
}
