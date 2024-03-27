package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.StudentDAO;
import model.StudentVO;

@WebServlet("/student")
public class StudentController extends HttpServlet {

	private static final long serialVersionUID = 905606343592314236L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		// 응답 헤더 설정 (JSON, utf-8)
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		// 응답 출력 객체를 하나 생성
		PrintWriter out = resp.getWriter();
		
		
		// json 데이터 준비
//		String json = "{\r\n" + 
//				"	\"name\" :  \"seo\",\r\n" + 
//				"	\"age\" : 33\r\n" + 
//				"}";
		
		// vo 데이터 준비
//		StudentVO stu1 = new StudentVO(101, "홍길동", 1, 2, 3);
//		StudentVO stu2 = new StudentVO(102, "김민지", 4, 5, 6);
		
		StudentDAO dao = new StudentDAO();
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("list", dao.selectAll());
		
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(map);
		
		// 준비한 데이터로 응답에 출력
		out.print(json);
		
	}
}
