<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	
	<fieldset>
		<legend>로그인</legend>
		<form action="loginCheck.jsp">
			
			<p><input type="text" name="id" placeholder="아이디" required></p>
			<p><input type="password" name="pw" placeholder="비밀번호" required></p>
			
			<p><button>로그인</button></p>
			
			<a href="findAcc.jsp">
				<button type="button">ID/PW 찾기</button>
			</a>
		</form>
	</fieldset>
	
	
</body>
</html>