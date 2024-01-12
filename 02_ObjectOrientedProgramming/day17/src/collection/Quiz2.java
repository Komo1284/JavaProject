package collection;

import java.net.URL;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Quiz2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// 한국도로공사 사이트에서 휴개소별 날씨 정보를 받아서 출력
		// https://data.ex.co.kr/openapi/basicinfo/openApiInfoM?apiId=0508
		
		URL url = new URL("https://data.ex.co.kr/openapi/restinfo/restWeatherList?key=test&type=json&sdate=20240111&stdHour=10");
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> map;
		map = om.readValue(url, new TypeReference<Map<String, Object>>() {});
		
		// 1. 타입 확인
		// System.out.println("list 타입 : " + map.get("list").getClass());
		
		// 2. 해당 타입으로 다운 캐스팅
		List<Object> list = (List<Object>)map.get("list");
		
		for (Object n : list) {
			map = (Map<String, Object>)n;
			
			// map.forEach((String k, Object v) -> System.out.printf("%s : %s\n", k, v));
			System.out.println(map.get("unitName"));
			System.out.println(map.get("addr"));
			System.out.println(map.get("weatherContents"));
			System.out.println();
		}
		
	}
}
