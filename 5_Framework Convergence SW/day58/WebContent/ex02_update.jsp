<%@page import="java.sql.Date"%>
<%@page import="model.vo.PersonVO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex20_update.jsp</title>
</head>
<body>
	<%
		PersonDAO dao = new PersonDAO();
		PersonVO per = new PersonVO();	
		
		String prevName = request.getParameter("prevName");
		String name = request.getParameter("name");
		String heigh = request.getParameter("height");
		String birth = request.getParameter("birth");
		double height = Double.parseDouble(heigh);
		
		per.setBirth(birth);
		per.setName(name);
		per.setHeight(height);
		
		dao.update(per, prevName);
		response.sendRedirect("ex02.jsp");
		
	%>

</body>
</html>