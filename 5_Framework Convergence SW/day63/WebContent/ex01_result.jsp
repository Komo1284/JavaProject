<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_result.jsp</title>
</head>
<body>
	<h1>필터 결과</h1>
	<hr>
	
	<c:set var="encoding" value="${pageContext.request.characterEncoding }"/>
	
	<ul>
		<li>현재 인코딩 : ${encoding }</li>
		<li>컨텍스트 루트 : ${cpath }</li>
		<li>파라미터 : ${param.name }</li>
	</ul>
	
	<a href="ex01.jsp">
		<button>ex01</button>
	</a>
</body>
</html>