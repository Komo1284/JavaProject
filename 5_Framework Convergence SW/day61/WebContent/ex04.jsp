<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.jsp</title>

<style>
	body{
		color: ${cookie.color == null ? 'black' : cookie.color.value };
	}
</style>
</head>
<body>
	<h1>EL의 쿠키 접근</h1>
	<hr>
	
	<h4>색상 전달</h4>
	<p>전달 받은 페이지에서 color라는 이름으로 16진수 색상값을 가진 Cookie를 발급</p>
	
	
	
	<form action="ex04_result.jsp">
		<input name="color" type="color">
		<button>전송</button>
	</form>
</body>
</html>