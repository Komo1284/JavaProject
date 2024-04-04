<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


	<h3>Controller</h3>
	
	<details>
		<ol>
			<li>Spring에서 Controller는 요청/응답을 처리하는 객체</li>
			<li>Controller는 Spring의 제어를 받아서 생성되고 관리된다</li>
			<li>이렇게 Spring의 관리를 받는 객체들을 Spring Bean이라고 한다</li>
			<li>Spring Bean은 서버 실행시 생성되어 Spring Container라는 공간에 저장된다</li>
			<li>Web 서버 실행에 필요하는 부분을 준비해주고 개발자는 핵심 로직에만 집중할 수 있게된다</li>
			<li>이러한 방식을 두고 IoC(Inverse Of control)라고 한다.</li>
		</ol>
	</details>
	
	<form method="post">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>로그인</button>
	</form>

</body>
</html>