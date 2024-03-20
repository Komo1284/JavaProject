<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex08.jsp</title>
</head>
<body>
	<h1>JSTL - 조건문</h1>
	<hr>
	
	<c:if test="10 > 5">
		<p>여기 실행이 되나요???</p>
	</c:if>
	
	<%-- 아래 2개 차이를 생각해 봅시다~ --%>
	<p>10 > 5</p>
	<p>${10 > 5 }</p>
	
</body>
</html>