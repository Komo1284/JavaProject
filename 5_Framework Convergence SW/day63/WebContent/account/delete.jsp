<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="dao" class="model.AccountDAO"/>
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		int row = dao.delete(acc.getIdx());
	%>

	<script>
		let result = <%=row %>;
		
		if (result != 0) {
			alert('탈퇴가 완료 되었습니다');
			location.href = '${cpath}/account/logout.jsp';
		}
		else {
			alert('탈퇴 실패');
			history.go(-1);
		}
	</script>

<%@ include file="../footer.jsp" %>