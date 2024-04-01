<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
	<div class="find">

		<fieldset>
			<legend>PW 찾기</legend>
			
			<form method="POST">
				<p><input name="userid" placeholder="아이디" required></p>
				<p><input name="email" type="email" placeholder="이메일" required></p>
			
				<button>find</button>
			</form>
		</fieldset>
	</div>
	
	<c:if test="${not empty userpw }">
		<script>
			alert('당신의 임시PW는 ${userpw} 입니다.');
			location.href='${cpath}';
		</script>
	</c:if>
	
	
</body>
</html>