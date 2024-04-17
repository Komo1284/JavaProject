<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<fieldset>
		<legend>Login</legend>
		<form method="post">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			
			<button>로그인</button>
			
		</form>
		<a href="${cpath }/account/newPw">
			<button>비밀번호찾기</button>
		</a>
		
	</fieldset>
	
	

</body>
</html>