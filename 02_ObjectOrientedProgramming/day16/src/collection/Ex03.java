package collection;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list = " + list);
		
		// Comparator를 전달하지 않으면 Comparable로 정렬을 수행
		list.sort(null);
		System.out.println("list = " + list);
		
		list.sort((Integer o1, Integer o2) -> o2 - o1);
		System.out.println("list = " + list);
	}
}
