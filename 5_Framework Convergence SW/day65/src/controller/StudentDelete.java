package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;

@WebServlet("/student/delete")
public class StudentDelete extends HttpServlet {
	
	private static final long serialVersionUID = 100L;
	private String path = "/WEB-INF/student/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		StudentDAO dao = new StudentDAO();
		int idx = Integer.parseInt(req.getParameter("idx"));
		int row = dao.delete(idx);
		
		if (row == 0) {
			RequestDispatcher rd = req.getRequestDispatcher(path + "update.jsp");
			rd.forward(req, resp);
		} else {
			resp.sendRedirect("/day65/student");
		}
		
	}

}
