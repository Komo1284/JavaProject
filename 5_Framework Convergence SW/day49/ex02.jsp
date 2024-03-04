<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>JSP</h1>
	<hr>
	
	<ul>
		<li>Java Server Page</li>
		<li>Java 언어를 사용해서 웹 페이지를 작성하는 언어</li>
		<li>기존 HTML코드에 Java코드를 같이 사용할 수 있다.</li>
	</ul>
	
	<h4>JSP 응답 과정</h4>
	
	<ol>
		<li>클라이언트가 서버에게 xxx.jsp 파일을 요청한다</li>
		<li>jsp 파일은 웹 브라우저가 처리할 수 없는 파일이라 바로 응답으로 주지 않는다</li>
		<li>서버 내에서 xxx.jsp -> xxx.java -> xxx.class 변환을 거친 후</li>
		<li>class를 실행한 결과를 응답한다</li>
	</ol>
</body>
</html>