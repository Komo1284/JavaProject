package collection;

import java.util.LinkedList;

public class Ex04 {
	public static void main(String[] args) {
		// ArrayList vs LinkedList
		// 1. ArrayList		: 속도는 빠르지만, 중간값 추가 제거시 오버헤드 발생 가능성이 있다
		// 2. LinkedList	: ArrayList보단 좀 느리지만, 오버헤드가 없다
		//
		// ※ 추가/제거가 빈번하게 발생하는 정보면 LinkedList가 유리하다
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("apple");
		list.add("samsung");
		list.add("nokia");
		
		System.out.println("list = " + list);
		System.out.println("사용법에 차이는 없다");
	}
}
