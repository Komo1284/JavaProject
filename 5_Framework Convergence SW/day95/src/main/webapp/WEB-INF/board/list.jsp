<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<h1>Board List</h1>
	<hr>
	
	<table>
		<thead>
			<tr>
				<th>No</th>
				<th>제목</th>
				<th>닉네임</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="/board/view?idx=${row.idx }">
				${row.title }</a></td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>${row.w_date }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>