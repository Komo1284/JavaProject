<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	
	<c:if test="${user == null}">
		<script>
			location.href = 'login.jsp';
		</script>
	</c:if> 

	<form method="post">
		<table>
			<tbody>
				<tr>
					<th>IDX</th>
					<td>${user.idx }</td>
				</tr>		
				<tr>
					<th>아이디</th>
					<td>${user.userid }</td>
				</tr>	
				<tr>
					<th>패스워드</th>
					<td><input name="userpw" type="password" required></td>
				</tr>	
				<tr>
					<th>닉네임</th>
					<td><input name="nick" value="${user.nick }" required></td>
				</tr>	
				<tr>
					<th>이메일</th>
					<td><input name="email" type="email" value="${user.email }" required></td>
				</tr>	
				<tr>
					<th>가입일</th>
					<td>${user.j_date }</td>
				</tr>	
			</tbody>
		</table>
		
		<br>
		
		<input name="idx" type="hidden" value="${user.idx }">
		
		<buttons class="buttons">
			<p><button>수정</button></p>
			<p><a href="${cpath }/account/delete?idx=${user.idx }">
				<button type="button">탈퇴</button>
			</a></p>
			
			<p><a href="${cpath }/board/myBoard.jsp?nick=${user.nick }">
				<button type="button">내가 작성한 글 보기</button>
			</a></p>
		</buttons>
	</form>
	
</body>
</html>