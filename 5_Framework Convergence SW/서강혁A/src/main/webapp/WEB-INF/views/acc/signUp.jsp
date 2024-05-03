<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<fieldset>
		<legend>회원가입</legend>
		<form method="post">			
			
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			<p><input name="nick" placeholder="닉네임" required></p>
			
			<p><button>가입하기</button></p>
		</form>
	</fieldset>
	

</body>
</html>