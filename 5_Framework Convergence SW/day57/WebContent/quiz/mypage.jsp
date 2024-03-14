<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<%
		Account user = (Account) session.getAttribute("user");
	%>
	
	<h4>마이 페이지~</h4>
	
	<%
		if(user != null) {		
	%>
		<table>
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th>Nick</th>
			<th>Name</th>
		</tr>
		<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getPw() %></td>
			<td><%=user.getNick() %></td>
			<td><%=user.getName() %></td>
		</tr>
		
		</table>
	<% 	}
		else {
	%>	<h4>로그인된 계정 없음</h4>
	<%	} %>

	
</body>
</html>