<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>FileFolder 목록</h4>

	<form method="post" enctype="multipart/form-data">
		<p><input name="upload" type="file"></p>
		<button>전송</button>
	</form>

	<table class="board">
		<tr>
			<th>파일명</th>
			<th>크기</th>
			<th>경로</th>
		</tr>
		<c:forEach var="file" items="${dir }">
			<tr>
				<td><a href="${cpath }/fileTest/${file.name }">
					${file.name }
				</a></td>
				<td>${file.length() }</td>
				<td>${file.path }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>