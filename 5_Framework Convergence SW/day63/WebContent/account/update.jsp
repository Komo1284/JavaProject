<%@page import="service.Hash"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="dao" class="model.AccountDAO"/>
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	
	<%
		Hash hash = new Hash();
		String hashPw = hash.getHash(acc.getUserpw());
	
		acc.setUserpw(hashPw);
		int row = dao.update(acc);
	%>

	<script>
		let result = <%=row %>;
		
		if (result != 0) {
			alert('수정이 완료 되었습니다');
			location.href = 'logout.jsp';
		}
		else {
			alert('수정 실패');
			history.go(-1);
		}
	</script>

<%@ include file="../footer.jsp" %>
