package collection;

import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex09 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		// 지정 주소로 요청을 보낼 객체
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employee/1");
		ObjectMapper om = new ObjectMapper();
		
		Map<String, Object> map;
		map = om.readValue(url, new TypeReference<Map<String, Object>>() {});
		map = (Map<String, Object>)map.get("data");
		
		map.forEach((String k, Object v) -> System.out.printf("%s : %s\n", k, v));
	}
}
