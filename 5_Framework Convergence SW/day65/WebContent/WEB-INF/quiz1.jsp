<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1.jsp</title>
</head>
<body>
	
	<h1>Quiz1</h1>
	<hr>
	
	<h4>요청 URI : /Quiz1</h4>
	
	<ul>
		<li>GET : quiz1.jsp로 포워드, 이름/나이를 입력 받아서 POST로 전달</li>
		<li>POST : quiz1_result.jsp로 포워드, 성인/미성년자를 구분한 결과를 출력</li>
	</ul>
	
	<form method="post">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age" type="number" placeholder="나이" required></p>
		
		<button>POST</button>
	</form>
	
</body>
</html>