<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
	
	<div class="find">
		<fieldset>
			<legend>ID 찾기</legend>
			
			<form method="POST">
				<p><input name="email" type="email" placeholder="이메일" required></p>
			
				<button>find</button>
			</form>
		</fieldset>
	</div>
	
	
	<c:if test="${not empty userid }">
		<script>
			alert('당신의 ID는 ${userid} 입니다.');
			location.href='${cpath}';
		</script>
	</c:if>
	
	
</body>
</html>