<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>지시자</h1>
	<hr>
	
	<h4>외부 jsp나 라이브러리를 import하는 용도로 자주 사용</h4>
	
	<%@page import="java.util.Date" %>
	
	<%
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String time = sdf.format(date);
	%>
	
	<ul>
		<li>현재 시간1 : <%=date %></li>
		<li>현재 시간2 : <%=time %></li>
	</ul>
</body>
</html>