<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_result.jsp</title>
</head>
<body>
	
	<%request.setCharacterEncoding("utf-8");%>
	<jsp:useBean id="per" class="beans.Person"/>
	<jsp:setProperty property="*" name="per"/>
	
	<%
		// 전달 받은 내용을 session에 저장
		session.setAttribute("per", per);
	
		response.sendRedirect("ex01.jsp");
	%>
	
</body>
</html>