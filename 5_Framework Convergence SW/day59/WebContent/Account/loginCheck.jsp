<%@page import="model.vo.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%request.setCharacterEncoding("utf-8"); %>
	
	<%
		String userid = request.getParameter("id");
		String userpw = request.getParameter("pw");
		
		AccountVO row = dao.login(userid, userpw);
		
		if (row != null) {
			session.setAttribute("acc", row);
	%>		
		<script>
			alert('로그인 되었습니다.');
			location.href = "home.jsp";
		</script>
	<%
		}else{
	%>		
		<script>
			alert('로그인에 실패하였습니다.');
			history.go(-1);
		</script>
	<%
		}
	%>
	

</body>
</html>