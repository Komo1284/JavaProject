<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>Account 테이블 목록</h4>
	
	<p>${ver }</p>
	
	<table>
		<tr>
			<th>회원번호</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.userid }</td>
			<td>${row.nick }</td>
			<td>${row.email }</td>
			<td>${row.j_date }</td>
			<th><a href="${cpath }/account/update?idx=${row.idx}">√</a></th>
			<th><a href="${cpath }/account/delete?idx=${row.idx}">√</a></th>
		</tr>
	</c:forEach>
	</table>
	
	<br>
	
	<a href="${cpath }/account/add">
		<button>버튼</button>
	</a>
	
	
	
	
	
	

</body>
</html>