<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<main class="signup">
		<fieldset>
			<legend>학생추가</legend>
			
			<form method="POST">
				<p><input name="name" placeholder="이름" required></p>
				<p><input name="kor" type="number" placeholder="국어점수" required></p>
				<p><input name="eng" type="number" placeholder="영어점수" required></p>
				<p><input name="mat" type="number" placeholder="수학점수" required></p>
			
				<button>추가하기</button>
			</form>
		</fieldset>
	</main>
</body>
</html>