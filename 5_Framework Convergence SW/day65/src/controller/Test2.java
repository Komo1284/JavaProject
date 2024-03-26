package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test2")
public class Test2 extends HttpServlet {


	private static final long serialVersionUID = 6515130963273579323L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/ex02.jsp");
		
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// req.setCharacterEncoding("utf-8");
		
		// 1. 필요한 로직을 servlet 메서드에서 처리한다 (= Java 코드)
		String name = req.getParameter("name");
		String msg = "당신의 이름은 " + name + "입니다";
		
		// 2. 처리 후 화면에 띄울 데이터를 Attribute에 담는다
		req.setAttribute("msg", msg);
		
		// 3. 해당 페이지로 포워드 시킨다
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex02_result.jsp");
		
		rd.forward(req, resp);
		
		System.out.println("전달 받은 name = " + name);
	}
}
