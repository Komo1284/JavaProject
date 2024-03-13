<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06_result.jsp</title>
</head>
<body>
	<%
		Account pg = (Account)pageContext.getAttribute("it");
		Account rq = (Account)request.getAttribute("t1");
		Account ss = (Account)session.getAttribute("rt");
		Account ap = (Account)application.getAttribute("ad");
		
		if (pg == null) { pg = new Account(); }
		if (rq == null) { rq = new Account(); }
		if (ss == null) { ss = new Account(); }
		if (ap == null) { ap = new Account(); }
	%>
	
	<h1>Attribute 결과</h1>
	<hr>
	
	<ul>
		<li>page = <%=pg.getId() %></li>
		<li>request = <%=rq.getId() %></li>
		<li>session = <%=ss.getId() %></li>
		<li>application = <%=ap.getId() %></li>
	</ul>
	
	<a href="ex06.jsp">
		<button>이동</button>
	</a>
	
	

</body>
</html>