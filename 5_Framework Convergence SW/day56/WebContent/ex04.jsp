<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>
</head>
<body>
	<h1>Forward의 request 유지</h1>
	<hr>
	
	<form action="ex04_forward.jsp" method="post">
		<input name="name" placeholder="이름" required>
		<button>전송</button>
	</form>
</body>
</html>