<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="service.Hash"%>
<%@ include file="../header.jsp" %>
	
	<jsp:useBean id="dao" class="model.AccountDAO"/>
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		Hash hash = new Hash();
	
		String srcPw = acc.getUserpw();
		String hashPw = hash.getHash(srcPw); 
		
		acc.setUserpw(hashPw);
	
		acc = dao.selectOne(acc);
		int row = 0;
		String nick = "";
		
		
		if (acc != null) {
			session.setAttribute("user", acc);
			row = 1;
			nick = acc.getNick();
		}
	%>


	<script>
		let result = <%=row %>;
		
		if (result != 0) {
			alert('<%=nick %>님 로그인');
			location.href = '${cpath}/home.jsp';
		}
		else {
			alert('로그인 실패');
			history.go(-1);
		}
	</script>

<%@ include file="../footer.jsp" %>