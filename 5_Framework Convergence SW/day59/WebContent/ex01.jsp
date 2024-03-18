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
	
	<h1>DBCP</h1>
	<hr>
	
	<h4>Database Connection Polling</h4>
	<p><%=ver %></p>
	
	<ul>
		<li>JDBC 접속을 좀 더 효율적으로 바꿔주는 라이브러리</li>
		<li>서버 실행시 일정량의 Connection을 만들어 Pool이라는 공간에 보관 후</li>
		<li>DB 연결이 필요할 때 마다 Pool에서 Connection을 꺼내 쓰고 반납하는 형태로 바뀐다</li>
	</ul>
</body>
</html>