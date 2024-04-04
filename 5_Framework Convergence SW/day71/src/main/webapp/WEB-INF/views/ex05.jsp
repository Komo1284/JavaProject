<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>ex05 입니다~</h4>
	
	<form method="post">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="height" type="number" step="0.1" placeholder="신장" required></p>
		<p><input name="birth" type="date" required></p>
		<p><input name="score" type="number" placeholder="토익(없으면-1)" required></p>
		
		<button>전송</button>
	</form>

</body>
</html>