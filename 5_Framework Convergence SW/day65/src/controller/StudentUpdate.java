package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StudentDAO;
import model.vo.StudentVO;

@WebServlet("/student/update")
public class StudentUpdate extends HttpServlet {
	
	private static final long serialVersionUID = 100L;
	private String path = "/WEB-INF/student/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		int idx = Integer.parseInt(req.getParameter("idx"));
		StudentDAO dao = new StudentDAO();
		StudentVO stu = dao.selectOne(idx);
		
		req.setAttribute("stu", stu);
		
		RequestDispatcher rd = req.getRequestDispatcher(path + "update.jsp");
		
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		StudentDAO dao = new StudentDAO();
		StudentVO stu = new StudentVO();
		int kor = Integer.parseInt(req.getParameter("kor"));
		int eng = Integer.parseInt(req.getParameter("eng"));
		int mat = Integer.parseInt(req.getParameter("mat"));
		int idx = Integer.parseInt(req.getParameter("idx"));
		
		stu.setName(req.getParameter("name"));
		stu.setKor(kor);
		stu.setEng(eng);
		stu.setMat(mat);
		stu.setIdx(idx);
		
		dao.update(stu);
		
		
		resp.sendRedirect("/day65/student");

		
		
	}
}
