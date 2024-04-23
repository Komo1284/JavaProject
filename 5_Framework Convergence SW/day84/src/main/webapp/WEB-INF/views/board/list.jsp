<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
	<h4>현재 로그인 계정 : ${user.nick }</h4>
	
	<table class="board">
		<thead>
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		</thead>
		
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="${cpath }/board/view/${row.idx}">
				${row.title }</a></td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>
					<f:formatDate 
						pattern="yyyy년 MM월 dd일 HH:mm:ss" 
						value="${row.w_date }"/>
				</td>
			</tr>	
			</c:forEach>
		</tbody>
	</table>
	
	<br>
	
	<a href="${cpath }/board/write">
	<button>글 쓰기</button></a>
	
</body>
</html>