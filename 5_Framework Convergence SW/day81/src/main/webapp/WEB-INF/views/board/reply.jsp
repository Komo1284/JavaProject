<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table>
		<tr>
			<th>댓글 번호</th>
			<th>게시글 번호</th>
			<th>계정번호</th>
			<th>ID</th>
			<th>작성자</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
	
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.b_idx }</td>
			<td>${row.u_idx }</td>
			<td>${row.userid }</td>
			<td>${row.nick }</td>
			<td>${row.contents }</td>
			<td>${row.w_date }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>