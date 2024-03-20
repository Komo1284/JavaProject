<%@page import="model.vo.PersonVO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_upInput.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<%
		String prevName = request.getParameter("name");
		PersonDAO dao = new PersonDAO();
		PersonVO per = new PersonVO();
		

		
	%>
	<h1>Person 수정</h1>
	<hr>
	<h4><%=prevName %>님의 정보를 수정</h4>
	<form action="ex02_update.jsp" method="post">
		<p><input name="name" placeholder="이름" required>
		<p><input name="height" type="number" step="0.1" placeholder="신장" required>
		<p><input name="birth" type="date" placeholder="생년월일" required>
		<p><input name="prevName" type="hidden" value="<%=prevName %>" required>
		<button>전송</button>
	</form>
	
	
	
</body>
</html>