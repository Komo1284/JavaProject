<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>EL</h1>
	<hr>
	
	<h4>Expression Language</h4>
	
	<ul>
		<li>표현 언어. 기존의 &lt;%= %> 표현식을 대체하기 위해 고안</li>
		<li>기존 표현식은 자바 변수에 접근할 수 있지만 Attribute 접근이 매우 불편</li>
		<li>이 Attribute 접근을 좀 더 수월하게 하는 것이 EL이다</li>
		<li>EL은 JSP 2.0 이후 기본으로 탑재 되어있어 라이브러리 추가 불필요</li>
		<li>EL은 pageScope를 자동으로 순환하며 Attribute를 가져온다</li>
		<li>순서) pageContext -> request -> session -> application</li>
		<li>뒤에 배울 JSTL (JSP Standard Tag Library)과 사용시 시너지가 매우 좋다</li>
	</ul>
</body>
</html>