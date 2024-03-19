<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<%
		
		String sidx = request.getParameter("idx");
		int idx = Integer.parseInt(sidx);
		AccountVO row = dao.selectOne(idx);
		

		
	%>

	<h4><%=row.getNick() %>님의 정보를 수정</h4>
	<form action="update.jsp" method="post">
		<p><input type="text" name="id" placeholder="아이디" value="<%=row.getUserid() %>" required></p>
        <p><input type="password" name="pw" placeholder="비밀번호" required></p>
        <p><input type="password" name="pw_check" placeholder="비밀번호 확인" required></p>
        <p><input type="text" name="nick" placeholder="닉네임" value="<%=row.getNick() %>" required></p>
        <p><input type="email" name="email" value="<%=row.getEmail() %>" placeholder="이메일"></p>
        <p><input type="hidden" name="idx" value="<%=row.getIdx() %>"></p>
		<button>수정하기</button>
	</form>

</body>
</html>