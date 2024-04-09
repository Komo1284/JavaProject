<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1>Junit</h1>
	<hr>
	
	<ul>
		<li>Java에서 제공하는 단위 테스트 프레임 워크</li>
		<li>소프트웨어의 각 로직을 테스트하기 용이하다</li>
		<li>단위 테스트를 잘 만들어 두면 에러 탐지도 수월해진다</li>
	</ul>
	
	<h4>만약 단위 테스트 없이 Spring 코드를 테스트시</h4>
	
	<ol>
		<li>MVC 패턴에서 DAO가 제대로 수행되는지 테스트 하고 싶다</li>
		<li>서버를 켠 후 클라이언트가 특정 URL로 요청한다</li>
		<li>Controller -> Service -> DAO 순으로 호출이 된다</li>
		<li>여기서 중간 과정이 잘 못되면  DAO는 실행되지 못하고 테스트도 불가능 해진다</li>
	</ol>
	
</body>
</html>