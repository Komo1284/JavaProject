<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<%
		String email = request.getParameter("email");
		String userid = dao.findId(email);
	%>
	
	<script>
		let userid = '<%= userid%>';
		
		if (user != 'null') {
			alert('찾으시는 ID는 ' + userid + '입니다');
			location.href = 'login.jsp';
		}
		else {
			alert('일치하는 정보가 존재하지 않습니다.');
		}
		
	</script>

</body>
</html>