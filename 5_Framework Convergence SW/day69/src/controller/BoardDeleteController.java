package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;

@WebServlet("/board/delete")
public class BoardDeleteController extends HttpServlet {

	private static final long serialVersionUID = 7164516485519136817L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sql = "delete board where idx = ?";
		
		int idx = Integer.parseInt(req.getParameter("idx"));
		
		DAO dao = new DAO();
		int row = dao.update(sql, idx);
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
		
	}
	
}
