<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>회원 정보 수정</h4>
	
	<form method="post">
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="닉네임" required></p>
		<p><input name="email" type="email" placeholder="이메일" required></p>
		<p><input name="idx" type="hidden" value="${param.idx }" required></p>
		
		<button>수정하기</button>
	</form>

</body>
</html>