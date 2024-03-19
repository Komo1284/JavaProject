<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<%
		String sidx = request.getParameter("idx");
		int idx = Integer.parseInt(sidx);

		int row = dao.delete(idx);
	%>
	
	<script>
		let row = <%=row %>;
		
		if (row != 0) {
			alert('삭제 성공');
			location.href = 'logout.jsp';
		}
		else {
			alert('삭제 실패');
			history.go(-1);
		}
		
	</script>

</body>
</html>