package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Ex06 {
	public static void main(String[] args) {
		// TreeMap은 key순으로 정렬해 저장
		// ※ mpa에서 key는 String, value는 Object를 주로 사용한다
		// - String은 사람이 판별하기 가장 좋은 타입이고
		// - Object는 java의 어떤 타입이든 저장이 가능
		Comparator<String> desc;
		desc = (String o1, String o2) -> {
			return o2.compareTo(o1);
		};
		
		TreeMap<String, Object> map = new TreeMap<>(desc);
		
		map.put("name", "홍길동");
		map.put("age", 33);
		map.put("height", 170.5);
		
		String[] hobby = { "게임", "소설", "영상" };
		map.put("hobby", Arrays.asList(hobby));
		
		map.forEach((String k, Object v) -> System.out.printf("%s : %s\n", k, v));
	}
}
