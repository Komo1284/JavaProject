<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1>JSP 설정</h1>
	
	<ul>
		<a href="/ex01">ex01</a></li>
		<a href="/ex02">ex02</a></li>
		<a href="/account/list">accountList</a></li>
	</ul>
	
	<hr>
	
	<c:forEach var="i" begin="1" end="5">
	<p>${i} : JSP 테스트 </p>
	</c:forEach>
	
</body>
</html>