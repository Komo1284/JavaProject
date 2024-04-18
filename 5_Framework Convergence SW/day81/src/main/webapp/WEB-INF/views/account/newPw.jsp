<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<fieldset>
		<legend>비밀번호 찾기</legend>
		<form method="post">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="email" type="email" placeholder="이메일" required></p>
			
			<button>찾기</button>
		</form>
		
	</fieldset>
	
	<c:if test="${not empty newPw }">
		<script>
			alert('당신의 새암호는 ${newPw}입니다.');
			location.href = '${cpath}/account/login';
		</script>
	</c:if>
	

</body>
</html>