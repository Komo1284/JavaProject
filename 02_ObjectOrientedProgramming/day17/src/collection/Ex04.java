package collection;

import java.util.HashMap;

// Map : key와 value의 한쌍으로 구성된 구조

public class Ex04 {
	public static void main(String[] args) {
		// key : 데이터를 접근하기 위한 index (중복x)
		// value : 실제 저장할 데이터
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("java", 80);
		map.put("python", 85);
		map.put("html", 70);
		
		System.out.println("map = " + map);
		
		System.out.println("map[\"java\"] = " + map.get("java"));
		
		// key는 중복되지 않는다. 동일한 key를 사용시 value가 변경됨
		map.put("java", 90);
		System.out.println("\nmap = " + map);
	}
}
