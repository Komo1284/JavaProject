package collection;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex07 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		String json = 
				"{" + 
					"\"name\": \"홍길동\"," + 
					"\"age\": 33," + 
					"\"height\": 176.3," + 
					"\"hobby\": [\"게임\", \"소설\", \"음악\"]" + 
				"}";
		
		// 1. json을 map으로 매핑할 객체
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map;
		
		// 2. 매핑시 저장 받을 map의 타입을 지정할 객체
		TypeReference<Map<String, Object>> tr = new TypeReference<Map<String,Object>>() {};
		
		// 3. 변경 수행
		map = om.readValue(json, tr);
		
		// 4. 결과 테스트
		map.forEach((String k, Object v) -> System.out.printf("%s : %s\n", k, v));
		
		String name = (String)map.get("name");
		int age = (Integer)map.get("age");
		double height = (Double)map.get("height");
		List<String> hobby = (List<String>)map.get("hobby");
		
		System.out.println("\n이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("신장 = " + height);
		System.out.println("취미 = " + hobby);
	}
}
