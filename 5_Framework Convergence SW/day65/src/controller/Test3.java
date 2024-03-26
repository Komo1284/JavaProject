package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test3")
public class Test3 extends HttpServlet{

	private static final long serialVersionUID = -2175745512151766737L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		out.write("<!DOCTYPE html>\n");
		out.write("<html>\n");
		out.write("<head>\n");
		out.write("<meta charset=\"utf-8\">\n");
		out.write("<title>ex03</title>\n");
		out.write("</head>\n");
		out.write("<<h1>View 없이 처리한 페이지</h1>\n");
		out.write("<hr>\n");
		out.write("<p style=\"color: red;\">여기는 Servlet에서 작성한 내용 입니다</p>\n");
		out.write("</body>\n");
		out.write("</html>\n");
	}
	
}
