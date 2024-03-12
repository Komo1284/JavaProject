<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	
	<h1>request 객체</h1>
	<hr>
	
	<h4>JSP는 요청에 관한 처리를 하기 위해 request 객체가 제공된다</h4>
	
	<ul>
		<li>서버주소 : <%=request.getLocalAddr() %></li>
		<li>서버 포트 : <%=request.getLocalPort() %></li>
		<li>클라 주소 : <%=request.getRemoteAddr() %></li>
		<li>클라 포트 : <%=request.getRemotePort() %></li>
		<li>요청 메서드 : <%=request.getMethod() %></li>
		<li>요청 URI : <%=request.getRequestURI() %></li>
		<li>요청 URL : <%=request.getRequestURL() %></li>
	</ul>
</body>
</html>