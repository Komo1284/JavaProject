package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO;
import model.vo.AccountVO;

@WebServlet("/board")
public class BoardController extends HttpServlet {

	private static final long serialVersionUID = 6284879404980304147L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		HttpSession session = req.getSession();
		AccountVO user = (AccountVO) session.getAttribute("user");
		RequestDispatcher rd;
		
		if(user != null) {
			rd = req.getRequestDispatcher("/WEB-INF/board/write.jsp");
			rd.forward(req, resp);
		} else {
			String cpath = req.getContextPath();
			resp.sendRedirect(cpath + "/account/login");
		}
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String sql = "insert into "
				+ "board(title, contents, user_idx) "
				+ "values(?, ?, ?)";
		
		String title = req.getParameter("title");
		String contents = req.getParameter("contents");
		int idx = Integer.parseInt(req.getParameter("user_idx"));
		
		DAO dao = new DAO();
		
		// 디버그
		int row = dao.update(sql, title, contents, idx);
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
		
	}
	
}
