<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>Filter 클래스</h1>
	<hr>
	
	<ul>
		<li>웹 컨테이너(= Tomcat)에 요청/응답이 발생하기 전에 먼저 호출되는 클래스</li>
		<li>주로 페이지마다 공통적인 기능을 수행할 떄 사용된다</li>
	</ul>
	
	<ul>
		<li>현재 인코딩 : ${pageContext.request.characterEncoding }</li>
		<li>컨텍스트 루트 : ${cpath }</li>
	</ul>
	
	<h4>ContextPath는 보통 어플리케이션 최상위 경로를 의미</h4>
	
	<form action="ex01_result.jsp" method="post">
		<input name="name" placeholder="이름 (한글)" required>
		<button>전송</button>
	</form>
</body>
</html>