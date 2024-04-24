<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table class="board">
		<thead>
		<tr>
			<th>계정번호</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		</thead>
		
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.userid }</td>
				<td>${row.nick }</td>
				<td>${row.email }</td>
				<td>${row.j_date }</td>
			</tr>	
			</c:forEach>
		</tbody>
	</table>

</body>
</html>