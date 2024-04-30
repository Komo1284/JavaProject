<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>


<form method="post" enctype="multipart/form-data">
	<table class="board">
		<tr>
			<th>프로필 이미지</th>
			<td>
				<img src="${cpath }/profile/${user.image }"
					 width="50px" height="50px">
					<br>
					<input name="upload" type="file">
			</td>
		</tr>
		<tr>
			<th>계정 번호</th>
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
			<td>${user.nick }</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${user.email }</td>
		</tr>
		<tr>
			<th>가입일</th>
			<td>${user.j_date }</td>
		</tr>
	</table>
	
	<br>
	<button>변경</button>
	<br>
	
</form>
	<a href="${cpath }/account/delete">
		<button>계정삭제</button></a>
</body>
</html>