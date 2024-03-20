<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<%
		String name = request.getParameter("name");
		
		PersonDAO dao = new PersonDAO();
		dao.delete(name);
		response.sendRedirect("ex02.jsp");
	%>
</body>
</html>