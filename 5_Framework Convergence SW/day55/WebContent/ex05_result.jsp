<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05_result.jsp</title>
</head>
<body>
	
	<%request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="stu" class="beans.Student"/>
	<jsp:setProperty name="stu" property="*" />
	
	<%
		int sum = stu.getKor() + stu.getEng() + stu.getMat();
		double avg = sum / 3.0;
	%>
	
	<h4>결과</h4>
	<hr>
	
	<ul>
		<li>이름 : <%=stu.getName() %></li>
		<li>합계 : <%=sum %></li>
		<li>평균 : <%=avg %></li>
	</ul>
	
</body>
</html>