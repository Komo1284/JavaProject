<%@page import="model.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>

	<%
		DAO dao = new DAO();
		String ver = dao.test();
	%>
	
	<h1>JDBC</h1>
	<hr>
	
	<h4><%=ver %></h4>
	
	<ul>
		<li>Java DataBase Connectivity</li>
		<li>Java로 DB에 접근을 제공하는 라이브러리</li>
	</ul>
</body>
</html>