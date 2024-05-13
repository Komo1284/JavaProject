<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	<form method="post">
		<table>
			<tr>
				<th>회원번호</th>
				<td>${user.idx }</td>	
			</tr>
			<tr>
				<th>아이디</th>
				<td>${user.userid }</td>	
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input name="userpw" type="password" required></td>	
			</tr>
			<tr>
				<th>닉네임</th>
				<td>${user.nick }</td>			
			</tr>
			<tr>
				<th>이메일</th>
				<td><input name="email" type="email" value="${user.email }" required></td>			
			</tr>
			<tr>
				<th>가입일</th>
				<td>${user.j_date }</td>			
			</tr>
		</table>
		<input name="idx" type="hidden" value="${user.idx }" required>
		<br>
		<button>수정하기</button>
	</form>
	
	
	<br>
	
	
	
	<a href="${cpath }/account/logout">
		<button>로그아웃</button>
	</a>

</body>
</html>