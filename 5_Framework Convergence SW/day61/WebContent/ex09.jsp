<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex09.jsp</title>
</head>
<body>
	<h1>JSTL - 조건문</h1>
	<hr>
	
	<form>
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age"  type="number" placeholder="나이" required></p>
		
		<button>전송</button>
	</form>
	
	<hr>
	
	<h4>결과</h4>
	
	<c:if test="${param.age >= 19 }">
		<p>${param.name }님은 성인 입니다</p>
	</c:if>
	
	<c:if test="${param.age < 19 }">
		<p>${param.name }님은 미성년자 입니다</p>
	</c:if>
	
</body>
</html>