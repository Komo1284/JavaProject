package abstract_;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06 {
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {10,50,20,40,30};
		
		// 인터페이스의 메서드가 당장 바로 필요한 경우엔 익명 클래스 혹은 람다식을 사용한다
		Comparator<Integer> asc = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};
		
		Arrays.sort(arr1, asc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
		Comparator<Integer> desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		Arrays.sort(arr1, desc);
		System.out.println("arr1 = " + Arrays.toString(arr1));
		
	}
}
