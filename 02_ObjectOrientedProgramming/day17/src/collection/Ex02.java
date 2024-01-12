package collection;

import java.util.ArrayList;
import java.util.HashSet;

// Set : 순서와 중복이 없는 구조

public class Ex02 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);	// 중복 데이터는 무시된다
		
		System.out.println("set = " + set);
		
		// - 순서(= index)가 없기 때문에 indexing 불가능
		// System.out.println("set[0] = " + set.get(0));
		
		set.remove(10);
		System.out.println("set = " + set);
		
		
		// collection들은 보통 다른 collection 간에 생성자로 변환이 가능하다
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		
		System.out.println("\nlist = " + list);
		System.out.println("list[0] = " + list.get(0));
	}
}
