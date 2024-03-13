<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_result.jsp</title>
</head>
<body>
	<h1>forward 결과</h1>
	<hr>
	
	<h4>F12 네트워크 탭을 열고 실습~</h4>
	
	<ul>
		<li>응답하는 페이지 이름을 잘 살펴본다</li>
		<li>request(= parameter)가 유지되는지 확인</li>
	</ul>
	
	<p>이름 : <%=request.getParameter("name") %></p>
</body>
</html>