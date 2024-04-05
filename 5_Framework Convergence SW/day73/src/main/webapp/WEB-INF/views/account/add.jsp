<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>회원 등록</h4>
	
	<form method="post">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="nick" placeholder="닉네임" required></p>
		<p><input name="email" type="email" placeholder="이메일" required></p>
		
		<button>가입</button>
	</form>
	<c:if test="${msg eq 1}">
		<script>
			alert('${msg}');
			location.href ='${cpath}/account/view';
		</script>
	</c:if>
	

</body>
</html>