<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_remove.jsp</title>
</head>
<body>
	<%
		session.removeAttribute("per");
		response.sendRedirect("ex01.jsp");
	%>
</body>
</html>