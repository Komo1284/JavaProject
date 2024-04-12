package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;

@WebServlet("/account")
public class UserController extends HttpServlet {

	private static final long serialVersionUID = 3661334342509780265L;
	
	private Mapper<AccountVO> mp = (ResultSet rs) -> {
		AccountVO row = new AccountVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		row.setNick(rs.getString("nick"));
		row.setEmail(rs.getString("email"));
		row.setJ_date(rs.getDate("j_date"));
		
		
		return row;
	};
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String pageParam = req.getParameter("page");
		int reqPage = pageParam != null ? Integer.parseInt(pageParam) : 1;
		
		DAO dao = new DAO();
		
		String sql = "select * from account " + 
						"order by idx desc " + 
						"offset ? rows " + 
						"fetch first ? rows only";
		
		Map<String, Object> map = new HashMap<>();
		map = dao.query(sql,reqPage, mp);
		
		req.setAttribute("map", map);
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("/WEB-INF/account/userList.jsp");
		
		rd.forward(req, resp);
	}

}