<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<main class="signup">
		<fieldset>
			<legend>학생 정보 수정</legend>
			
			<form method="POST">
				<p><input name="name" placeholder="이름" value="${stu.name }" required></p>
				<p><input name="kor" type="number" placeholder="국어점수" value="${stu.kor }" required></p>
				<p><input name="eng" type="number" placeholder="영어점수" value="${stu.eng }" required></p>
				<p><input name="mat" type="number" placeholder="수학점수" value="${stu.mat }" required></p>
				<p><input name="idx" type="hidden" value="${param.idx }" required></p>
				<button>수정하기</button>
			</form>
		</fieldset>
	</main>
</body>
</html>