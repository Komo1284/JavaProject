<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_input.jsp</title>
</head>
<body>
	<h1>Person 추가</h1>
	<hr>
	
	<form action="ex02_insert.jsp" method="post">
		<p><input name="name" placeholder="이름" required>
		<p><input name="height" type="number" step="0.1" placeholder="신장" required>
		<p><input name="birth" type="date" placeholder="생년월일" required>
		
		<button>전송</button>
	</form>
	
</body>
</html>