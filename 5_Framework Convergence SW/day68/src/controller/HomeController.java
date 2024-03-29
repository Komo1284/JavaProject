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

@WebServlet("/home")
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = -8753957661320028246L;
	
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String sql = "select * from board_view order by idx desc";
		DAO dao = new DAO();
		
		req.setAttribute("list", dao.query(sql, mp));
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/WEB-INF/home.jsp");
		
		rd.forward(req, resp);
	}
	
}
