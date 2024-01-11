package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		// list는 순서(index)가 있으므로 반복이 가능하다
		// - 새로운 데이터를 그때그때 추가 및 제거해서 사용한다
		Integer[] arr = new Integer[] { 10,50,60,70,30,40 };
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println("list = " + list);
		
		// list는 순서(index)가 있으므로 반복이 가능하다
		// 1. 일반 for : index로 반복
		for (int i = 0; i< list.size(); i++) {
			System.out.printf("list[%d] = %d\n", i, list.get(i));
		}
		
		// 2. for-each문
		for (int n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		
		// 3. iterator : 순환자
		Iterator<Integer> it = list.iterator();
		
		while (it.hasNext()) {		// hasNext() : 커서는 이동하지 않고, 다음 데이터가 있는지 확인
			int n = it.next();		// next() : 커서를 다음으로 이동 후 그 데이터를 반환
			System.out.println("n = " + n);
		}
		
		// 순환을 마친 it 참조 변수는 다시 앞으로 오지 않는다
		System.out.println(it.hasNext());
		
		// 다시 앞으로 돌리려면 해당 컬렉션으로 부터 iterator를 다시 받는다
		it = list.iterator();
		System.out.println(it.hasNext());
		
		
		// ※ 아래는 참조만
		// 람다식을 전달인자로 바로 사용시 {}는 작성하면 안됨
		list.forEach((Integer t) -> System.out.println("t = " + t)); 
		
	}
}
