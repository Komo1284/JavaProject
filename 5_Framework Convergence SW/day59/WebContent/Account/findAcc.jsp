<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<div class="find">
		<fieldset>
			<legend>ID 찾기</legend>
			<form action="findId.jsp">
				
				<p><input type="email" name="email" placeholder="이메일" required></p>
				
				<p><button>Find</button></p>
				
				
			</form>
		</fieldset>
		
		<fieldset>
			<legend>PW 찾기</legend>
			<form action="findPw.jsp">
				
				<p><input type="text" name="userid" placeholder="아이디" required></p>
				<p><input type="email" name="email" placeholder="이메일" required></p>
				
				<p><button>Find</button></p>
				
				
			</form>
		</fieldset>
	</div>
	

</body>
</html>