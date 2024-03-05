<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz1.jsp</title>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<h4>JSP 구문을 활용해서 구구단 2단을 출력(x1 ~ x9)</h4>
	
	<%
		for (int i = 1; i <= 9; i++) {
			out.println("2 x " + i + " = " + i*2 + "<br>");
		}
	%>
</body>
</html>