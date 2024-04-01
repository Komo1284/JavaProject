package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/account/logout")
public class LogoutController extends HttpServlet {

	private static final long serialVersionUID = -6818614636227443604L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		session.removeAttribute("user");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
		
	}
	
}
