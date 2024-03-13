<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_forward.jsp</title>
</head>
<body>

	<%
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("ex04_result.jsp");
		
		rd.forward(request, response);
	%>

</body>
</html>