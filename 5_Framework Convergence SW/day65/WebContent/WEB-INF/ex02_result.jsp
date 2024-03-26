<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_result.jsp</title>
</head>
<body>
	<h1>요청 메서드 구분 -결과</h1>
	<hr>
	
	<p>같은 URI로 요청을 해도 서블릿은 구분해서 처리 가능</p>
	
	<p>전달 받은 데이터 : ${msg}</p>
	
	<a href="/day65/Test2">
		<button>GET</button>
	</a>
</body>
</html>