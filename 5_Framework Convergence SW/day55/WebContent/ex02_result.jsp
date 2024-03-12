<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		// POST로 전송된 데이터는 encoding이 자동으로 적용되지 않는다
		// 따라서 parameter받기 전에 꼭 설정을 해야 한글 등이 깨지지 않음
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String method = request.getMethod();
	%>
	
	<h1>결과 페이지</h1>
	<hr>
	
	<h4>요청 메서드 : <%=method %></h4>
	
	<ul>
		<li>이름 : <%=name %></li>
		<li>이메일 : <%=email %></li>
	</ul>
</body>
</html>