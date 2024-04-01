package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import service.HashPw;

@WebServlet("/account/myPage")
public class MyPageController extends HttpServlet{

	private static final long serialVersionUID = 4808699220271977416L;
	
	private String path = "/WEB-INF/account/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "myPage.jsp");
		
		rd.forward(req,	resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sql = "update account " + 
						"set userpw = ?, " + 
							"nick = ?, " + 
							"email = ? " + 
							"where idx = ?";
		
		String userpw = req.getParameter("userpw");
		String nick = req.getParameter("nick");
		String email = req.getParameter("email");
		int idx = Integer.parseInt(req.getParameter("idx"));
		
		userpw = HashPw.getHash(userpw);
		
		DAO dao = new DAO();
		
		int row = dao.update(sql, userpw, nick, email, idx);
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath + "/account/logout");
		
	}
}
