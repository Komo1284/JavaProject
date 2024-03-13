<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>Response 응답</h1>
	<hr>
	
	<%--
		request : 클라이언트가 서버에게 통신을 하는 행위
		response : 서버가 클라이언트에게 통신을 하는 행위
		
		response는 주로 리다이렉트, 에러 코드 메세지, 쿠키 등을 전달시 사용된다
	 --%>
	 
	 <%
	 	// response.sendError(400);
	 	// - sendError() : 클라이언트에게 에러 상태 코드를 보낸다
	 	
	 	response.sendRedirect("https://www.naver.com/");
	 	// - sendRedirect() : 클라이언트에게 이동할 페이지를 지정한다
	 %>
</body>
</html>