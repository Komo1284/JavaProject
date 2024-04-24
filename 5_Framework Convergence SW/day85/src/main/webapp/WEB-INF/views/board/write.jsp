<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<c:set var="update" value="${not empty row }"/>

	<form method="POST">
		<p><input name="title" value="${row.title }" placeholder="제목" required></p>
		<p><input name="nick" value="${row.nick }" placeholder="닉네임" required></p>
		<p><textarea name="contents" placeholder="내용">${row.contents }</textarea></p>
		<c:if test="${not empty row }">
			<input name="idx" type="hidden" value="${row.idx }">
		</c:if>
		<button>전송</button>
	</form>

</body>
</html>