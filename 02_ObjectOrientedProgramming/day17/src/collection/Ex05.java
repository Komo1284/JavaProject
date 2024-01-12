package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;

public class Ex05 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("java", 80);
		map.put("python", 85);
		map.put("html", 70);
		
		
		// map은 순환이 불가능한 구조(= Not Iterable)
		Set<String> keys = map.keySet();
		
		// 1. for-each
		for (String key : keys) {
			int value = map.get(key);
			System.out.printf("%s : %d\n", key, value);
		}
		System.out.println();
		
		
		// 2. iterator
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			System.out.printf("%s : %d\n", key, map.get(key));
		}
		System.out.println();
		
		
		// 아래는 참고
		map.forEach((String k, Integer v) -> System.out.printf("%s : %d\n", k, v));
	}
}
