<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_reuslt.jsp</title>
</head>
<body>
	<%
		// String getParameter(String name);
		// - 파라미터 이름을 전다랗면 저장된 값을 반환
		// - 없는 이름을 전달하면 null을 반환
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	%>

	<h1>parameter 결과</h1>
	<hr>
	
	<ul>
		<li>이름 : <%=name %></li>
		<li>나이 : <%=age %></li>
	</ul>
	
	<a href="ex04.jsp">
		<button>ex04</button>
	</a>
</body>
</html>