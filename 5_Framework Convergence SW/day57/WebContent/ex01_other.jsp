<%@page import="beans.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_other.jsp</title>
</head>
<body>
	<%
		Person per = (Person) session.getAttribute("per");
	%>
	
	<h1>session 이동 후</h1>
	<hr>
	
	<h4>현재 세션 정보 : <%=per %></h4>
	
	<a href="ex01.jsp">돌아가기</a>
</body>
</html>