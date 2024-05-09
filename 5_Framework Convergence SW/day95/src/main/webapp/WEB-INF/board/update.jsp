<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="post">
		
		<p><input name="title" placeholder="제목" value="${bd.title }" required></p>
		<p><textarea name="contents">${bd.contents }</textarea></p>
		<input name="idx" type="hidden" value="${param.idx }">
		
		<p><button>작성하기</button></p>
		
	</form>
	
</body>
</html>