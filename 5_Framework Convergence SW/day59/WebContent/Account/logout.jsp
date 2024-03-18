<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%
		session.removeAttribute("acc");
		response.sendRedirect("home.jsp");
	%>

</body>
</html>