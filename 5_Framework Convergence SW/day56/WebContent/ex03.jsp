<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
</head>
<body>
	<h1>Forward</h1>
	<hr>
	
	<%--
		서버가 응다바는 페이지를 전환하는 방법은 2가지이다
		1. Redirect
		- 서버가 클라이언트에게 이동할 페이지를 알려주면 클라이언트가 이동
		- 따라서, 클라이언트는 응답이 변경된 페이지임을 알고 있다
		- 또, 자신의 서버 페이지 뿐만 아니라 외부 사이트로 이동도 가능
		- 단, request가 유지되지 않는다
		
		2. Forward
		- 서버 내부에서 응답할 페이지가 전환된다
		- 따라서, 클라이언트는 페이지가 변경된지 알아차리지 못 함
		- 이때, 페이지 변경시 request가 유지되는 특징을 가진다
		- 단, 외부 사이트로는 이동이 불가능
		
		※ forward는 요청을 받는 페이지와 응답을 하는 페이지를 별도로 관리시 사용
		ex) MVC2, Spring MVC에서 사용
	--%>
	
	<%
		RequestDispatcher rd = request.getRequestDispatcher("ex02.jsp");
		rd.forward(request, response);
	%>
</body>
</html>