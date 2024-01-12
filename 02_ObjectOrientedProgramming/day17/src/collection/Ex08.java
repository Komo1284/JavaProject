package collection;

import java.util.Map;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex08 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		String xml = 
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<person>" + 
					"<name>홍길동</name>" +
					"<age>33</age>" + 
					"<height>176.3</height>" + 
					"<hobby>게임</hobby>" + 
					"<hobby>소설</hobby>" + 
					"<hobby>음악</hobby>" + 
				"</person>";

		JSONObject jo = XML.toJSONObject(xml);
		String json = jo.toString(4);
		
		System.out.println(json);
		
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map;
		
		map = om.readValue(json, new TypeReference<Map<String, Object>>() {});
		map = (Map<String, Object>)map.get("person");
	
		map.forEach((String k, Object v) -> System.out.printf("%s : %s\n", k, v));
	}
}
