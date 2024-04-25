<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<c:set var="update" value="${not empty row }"/>

	<form method="POST" enctype="multipart/form-data">
		<p><input name="title" value="${row.title }" placeholder="제목" required></p>
		<p><input name="user_idx" value="${row.user.idx }" placeholder="유저idx" required></p>
		<p><input name="file" type="file"></p>
		<p><textarea name="contents" placeholder="내용">${row.contents }</textarea></p>
		<c:if test="${not empty row }">
			<input name="idx" type="hidden" value="${row.idx }">
		</c:if>
		
		<button>전송</button>
	</form>

</body>
</html>