package nested;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
	public static void main(String[] args) {
			
		Integer[] arr = new Integer[] {10,50,40,20,30};
		
		class DescInt implements Comparator<Integer>{
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		}
		
		DescInt desc = new DescInt();
		
		Arrays.sort(arr,desc);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
