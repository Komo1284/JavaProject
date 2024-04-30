<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<form method="POST" enctype="multipart/form-data">
	<table class="board">
		<tr>
			<td>
				<input name="title" placeholder="제목">
			</td>
		</tr>
		<tr>
			<td>
				<textarea name="contents"></textarea>
			</td>
		</tr>
	</table>
	
	<p>첨부 파일</p>
	<input name="file" type="file">
	<input name="a_idx" type="hidden" value="${user.idx }">
	
	<p><button>작성</button></p>
</form>

</body>
</html>