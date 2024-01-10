package abstract_;

import java.util.Arrays;
import java.util.Comparator;

// 객체의 비교를 지원하는 인터페이스
// 1. Comparator
// 2. Comparable

class DescInteger implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2 - o1;
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {10,50,20,40,30};
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		DescInteger desc = new DescInteger();
		
		Arrays.sort(arr1, desc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
	}
}
