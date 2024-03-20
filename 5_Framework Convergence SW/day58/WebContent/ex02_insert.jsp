<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_insert.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="per" class="model.vo.PersonVO"/>
	<jsp:setProperty property="*" name="per"/>
	
	<%
		String birth = request.getParameter("birth");
		per.setBirth(birth);
		
		PersonDAO dao = new PersonDAO();
		dao.insert(per);
		response.sendRedirect("ex02.jsp");
	%>
	
	<p>이름 : <%=per.getName() %></p>
	<p>신장 : <%=per.getHeight() %></p>
	<p>생년월일 : <%=per.getBirth() %></p>
	
</body>
</html>