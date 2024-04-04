<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


	<h3>Service</h3>
	
	<details>
		<ol>
			<li>Spring에서 Service는 서버에서 처리할 주요 로직을 실행하는 객체</li>
			<li>Service는 Spring의 제어를 받아서 생성되고 관리된다</li>
			<li>마찬가지로 Spring Bean이다</li>
		</ol>
	</details>
	
	<form method="post">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>로그인</button>
	</form>

</body>
</html>