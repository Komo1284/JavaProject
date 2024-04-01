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
import model.vo.AccountVO;
import service.HashPw;
import service.NewPw;

@WebServlet("/account/findPw")
public class FindPwController extends HttpServlet {

	private static final long serialVersionUID = 5956238400373465130L;

	private String path = "/WEB-INF/account/";
	
	private Mapper<AccountVO> mp = (ResultSet rs) -> {
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJ_date(rs.getDate("j_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		
		return row;
	};

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "findPw.jsp");
		
		rd.forward(req,	resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		String sql = "select * from account where userid = ? and email = ?";
		
		DAO dao = new DAO();
		
		String userid = req.getParameter("userid");
		String email = req.getParameter("email");
		
		AccountVO user = dao.queryForObject(sql, mp, userid, email);
		System.out.println(user.getIdx());
		
		// newPw 만들어서 request로 전달
		String newPw = NewPw.getPw();
		req.setAttribute("userpw", newPw);
		
		// hash처리하여 업데이트후 포워드
		String hashpw = HashPw.getHash(newPw);
		
		sql = "update account set userpw = ? where idx = ?";
		
		int row = dao.update(sql, hashpw, user.getIdx());
		
		System.out.println(row == 0 ? "실패" : "성공");
		
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "findPw.jsp");
		
		rd.forward(req, resp);
		
	}
	
	
}
