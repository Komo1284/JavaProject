<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>
</head>
<body>
	<h1>Java Bean</h1>
	<hr>
	
	<h4>어플리케이션에서 데이터를 쉽게 주고 받기 위한 Java 객체</h4>
	
	<form action="ex04_result.jsp" method="POST">
		<p><input name="name" placeholder="이름" required>
		<p><input name="age" type="number" placeholder="나이" required>
		<p><input name="height" type="number" step="0.1" placeholder="신장" required>
		
		<button>전송</button>
	</form>
</body>
</html>