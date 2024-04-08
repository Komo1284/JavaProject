<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<main>
	<form method="POST">
		<table class="board write">
			<thead>
				<tr>
					<td><input name="title" value="${bd.title }" placeholder="제목 (최대 30자)"></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><textarea name="contents" placeholder="바른말을 사용합시다~">${bd.contents }</textarea></td>
				</tr>
			</tbody>
		</table>
		
		<br>
		
		<input name="idx" type="hidden" value="${bd.idx }">
		<button>수정하기</button>
	</form>
</main>
	

</body>
</html>