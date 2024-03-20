<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_reuslt.jsp</title>
</head>
<body>

	
	<%
		String color = request.getParameter("color");
		Cookie ck = new Cookie("color",color);
		
		ck.setMaxAge(3600);
		response.addCookie(ck);
		
	%>
	
	<h4>전달받은 색상 : ${cookie.color.value}</h4>
</body>
</html>