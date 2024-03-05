<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	
	<ul>
		<li>quiz2.jsp : 두 정수를 입력 받아서 quiz2_result.jsp로 전송</li>
		<li>quiz2_result.jsp : 전달 받은 두 정수의 합계를 출력</li>
	</ul>
	
	<form action="quiz2_result.jsp">
		<p><input name="num1" type="number" placeholder="정수1"></p>
		<p><input name="num2" type="number" placeholder="정수2"></p>
		<p><button>전송</button></p>
	</form>
</body>
</html>