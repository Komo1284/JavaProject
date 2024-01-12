package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex03 {
	public static void main(String[] args) {
		// TreeSet : 정렬해서 요소를 저장
		// - Comparable을 가지고 정렬한다
		// - 생성자에 Comparator를 줘서 정렬 기준을 변경할 수 있다
		Comparator<Integer> desc;
		
		desc = (Integer o1, Integer o2) -> {
			return o2 - o1;
		};
		
		TreeSet<Integer> set = new TreeSet<Integer>(desc);
		
		for (int i = 10; i <= 50; i += 10) {
			set.add(i);
		}
		
		System.out.println("set = " + set);
	}
}
