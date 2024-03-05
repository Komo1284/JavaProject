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
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		
		if(n1 == null || n2 == null) { 
			n1 = n2 = "0";
		}
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
	%>
	
	<h1>두 정수의 합계</h1>
	<hr>
	
	<p><%=num1 %> + <%=num2 %> = <%=num1 + num2 %></p>
</body>
</html>