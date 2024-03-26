package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Quiz1")
public class Quiz1 extends HttpServlet{

	private static final long serialVersionUID = -613317442586327402L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/quiz1.jsp");
		
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));

		String msg = name + "님은 성인입니다.";
		if(age <= 19) {
			msg = name + "님은 미성년자입니다.";
		}
		
		req.setAttribute("msg", msg);
		

		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/quiz1_result.jsp");
		
		rd.forward(req, resp);
		
		
	}
	
}
