package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import model.vo.StudentVO;

@WebServlet("/student")
public class Student extends HttpServlet {

	private static final long serialVersionUID = 200L;
	
	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		response.setHeader("Access-Control-Allow-Origin", "*");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 응답 헤더 설정 (json, utf-8)
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");

		// 응답 출력 객체를 하나 생성
		PrintWriter out = response.getWriter();
		
		// vo 데이터 준비
		StudentDAO dao = new StudentDAO();
		Map<String, Object> map = new HashMap<>();
		
		map.put("list", dao.selectAll());
		
		// json 문자열로 변환
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(map);
		
		// 준비한 데이터로 응답에 출력
		out.print(json);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		
		// 1. request의 헤더에 있는 입력값(json)을 처리하기 위한 입출력 객체
		InputStreamReader isr = new InputStreamReader(request.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		// 2. json 내용을 문자열로 읽어오고
		String line = br.readLine();
		br.close();
		
		// 3. 이를 StudentVO로 변환
		StudentVO stu = new StudentVO();
		ObjectMapper om = new ObjectMapper();
		
		stu = om.readValue(line, StudentVO.class);
		
		// 4. insert 수행
		StudentDAO dao = new StudentDAO();
		int row = dao.insert(stu);
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		StudentDAO dao = new StudentDAO();
		
		int row = dao.delete(idx);
		
		if (row == 0) {
			response.sendError(400);
		}
	}
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		InputStreamReader isr = new InputStreamReader(request.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		String json = br.readLine();
		ObjectMapper om = new ObjectMapper();
		StudentVO stu = om.readValue(json, StudentVO.class);
		
		StudentDAO dao = new StudentDAO();
		int row = dao.update(stu);
		
		if (row == 0) {
			response.sendError(400);
		}
	}
}
