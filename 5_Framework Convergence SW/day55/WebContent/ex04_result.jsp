<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_result.jsp</title>
</head>
<body>
	
	<%
		request.setCharacterEncoding("utf-8");
	%>
	
	<jsp:useBean id="per" class="beans.Person"/>
	<%-- Person per = new Person(); 와 동일한 코드 --%>
	
	<jsp:setProperty name="per" property="*" />
	<%-- 위는 Person의 setter를 사용하고 --%>
	<%-- 필드명과 파라미터명이 같으면 * 사용시 1:1로 모두 저장된다 --%> 
	
	<h1>결과 페이지</h1>
	<hr>
	
	<ul>
		<li>이름 : <%=per.getName() %></li>
		<li>나이 : <%=per.getAge() %></li>
		<li>신장 : <%=per.getHeight() %></li>
	</ul>
	<hr>
</body>
</html>