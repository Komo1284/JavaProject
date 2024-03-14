<%@page import="beans.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>session 세션</h1>
	<hr>
	
	<ul>
		<li>HTTP. 즉, WEB 서버는 초창기 서버의 효율을 위해 아래 둘로 설정되었다</li>
		<li>Connection Less : 연결을 유지하지 않음</li>
		<li>Status Less : 상태 정보를 저장하지 않음</li>
		<li>그러나 후에 컴퓨터 성능 증가와 클라이언트들의 개인 서비스 요구가 생기게 된다</li>
		<li>따라서, 연결 및 상태를 유지해야 하는 기술이 필요해 졌다</li>
		<li>대표적인 기술 2가지가 session과 cookie이다</li>
	</ul>
	
	<%
		// 세션에 저장된 정보 가져오기
		Person per = (Person) session.getAttribute("per");
	
		// 세션 저장 이름의 정보가 있으면 인스턴스가 없으면 null이 반환
	%>
	
	<h4>현재 세션 정보 : <%=per %></h4>
	
	<a href="ex01_other.jsp">다른 페이지 이동</a>
	
	
	<form action="ex01_result.jsp" method="post">
		<p><input name="name" placeholder="이름" required></p>
		<p><input name="age" type="number" placeholder="나이" required></p>
		<button>전송</button>
		<a href="ex01_remove.jsp">
			<button type="button">제거</button>
		</a>
	</form>
</body>
</html>