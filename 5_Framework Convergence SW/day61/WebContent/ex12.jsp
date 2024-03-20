<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex12.jsp</title>
</head>
<body>
	<%
		int[] arr = new int[] {10, 20, 30, 40, 50};
	%>
	
	<h1>JSTL - 반복문</h1>
	<hr>
	
	<c:forEach var="num" items="<%=arr %>">
		<p>num = ${num }</p>
	</c:forEach>
	
</body>
</html>