<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>
</head>
<body>
	<h1>Parameter 처리</h1>
	<hr>
	
	<ul>
		<li>다른 페이지나 클라이언트가 전송한 데이터를 의미</li>
		<li>JSP, ASP, Python, PHP 등의 Back-End 언어로 처리 가능</li>
	</ul>
	
	<form action="ex04_result.jsp">
		<p><input name="name" type="text" placeholder="이름"></p>
		<p><input name="age" type="number" placeholder="나이"></p>
		<p><button>전송</button></p>
	</form>
</body>
</html>