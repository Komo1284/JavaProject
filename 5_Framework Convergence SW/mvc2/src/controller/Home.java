package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. localhost:8080/mvc2/home으로 요청시 아래 Home.java의 코드가 실행된다
@WebServlet("/home")
public class Home extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8753957661320028246L;
	
	// 2. 그때 요청 메서드에 따라서 호출할 메서드를 오버라이드 한다
	// 즉, /home으로 get을 요청하면 아래 메서드가 실행됨
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		// System.out.println("/home, GET 요청");
		
		// 처리할 로직
		req.setAttribute("name", "홍길동");
		
		// 포워드 구문
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/WEB-INF/home.jsp");
		
		rd.forward(req, resp);
	}
	
	
}
