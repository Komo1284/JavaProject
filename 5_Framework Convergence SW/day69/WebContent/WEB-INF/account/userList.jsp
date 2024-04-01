<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>

	<table class="board">
		<thead>
		<tr>
			<td>회원번호</td>
			<td>아이디</td>
			<td>닉네임</td>
			<td>이메일</td>
			<td>가입일</td>
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
</main>
</body>
</html>