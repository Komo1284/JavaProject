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

@WebServlet("/account/signUp")
public class SignUpController extends HttpServlet {

	private static final long serialVersionUID = 7318255021631026855L;
	
	private String path = "/WEB-INF/account/";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "signUp.jsp");
		
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		String sql = "insert into "
				+ "account(userid, userpw, nick, email) "
				+ "values(?, ?, ?, ?)";
		
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		String nick = req.getParameter("nick");
		String email = req.getParameter("email");
		
		userpw = HashPw.getHash(userpw);
		
		
		DAO dao = new DAO();
		
		// 디버그
		int row = dao.update(sql, userid, userpw, nick, email);
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
		
	}
}
