package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.BoardVO;

@WebServlet("/board/update")
public class BoardUpdateController extends HttpServlet{

	private static final long serialVersionUID = 7275517951991521792L;

	private String path = "/WEB-INF/board/";
	
	private Mapper<BoardVO> mp = (ResultSet rs) -> {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setNick(rs.getString("nick"));
		row.setTitle(rs.getString("title"));
		row.setV_count(rs.getInt("v_count"));
		row.setW_date(rs.getDate("w_date"));
		
		
		return row;
	};
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sql = "select * from board_view where idx = ?";
		
		int idx = Integer.parseInt(req.getParameter("idx"));
		
		DAO dao = new DAO();
		
		req.setAttribute("row", dao.queryForObject(sql, mp, idx));
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "update.jsp");
		
		rd.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sql = "update board " + 
					"set title = ?, " + 
						"contents = ? " + 
						"where idx = ?";

		String title = req.getParameter("title");
		String contents = req.getParameter("contents");
		int idx = Integer.parseInt(req.getParameter("idx"));
		
		DAO dao = new DAO();
		
		int row = dao.update(sql, title, contents, idx);
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
		
	}
	
}
