<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
</head>
<body>
	<h1>pageScope</h1>
	<hr>
	
	<h4>JSP에서 제공되는 4가지 객체</h4>
	
	<ol>
		<li>pageContext : 페이지만 생성되고 응답되면 제거되는 객체</li>
		<li>request : pageContext와 동일한 수명. 단, forward시 다른 페이지에서도 유지된다</li>
		<li>session : 웹 브라우저가 종료될 때 까지 유지</li>
		<li>application : 웹 서버가 종료될 때 까지 유지</li>
	</ol>
	
	<h4>위의 4가지 객체들은 Attribute라는 공간을 가진다</h4>
	
	<ul>
		<li>Attribute는 개발자가 필요한 데이터를 저장 및 꺼내쓰는 공간</li>
		<li>객체가 4가지이며 수명에 따라서 절히 사용하는 것이 좋다</li>
	</ul>
</body>
</html>