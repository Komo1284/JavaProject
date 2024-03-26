package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/student")
public class StudentList extends HttpServlet {

	private static final long serialVersionUID = 905606343592314236L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		StudentDAO dao = new StudentDAO();
		
		req.setAttribute("list", dao.selectAll());
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/student/list.jsp");
		
		rd.forward(req, resp);
		
	}
	
}
