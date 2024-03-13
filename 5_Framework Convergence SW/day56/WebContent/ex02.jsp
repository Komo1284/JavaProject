<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>Redirect</h1>
	<hr>
	
	<h4>리다이렉트 특징</h4>
	
	<ul>
		<li>클라이언트에게 이동할 페이지를 지정하는 메세지</li>
		<li>리다이렉트 메시지를 받은 클라이언트는 강제로 지정 페이지로 이동된다</li>
		<li>이때, 클라이언트는 요청을 새로 만들어 지정 페이지에 요청한다</li>
		<li>즉, 리다이렉트시 요청(request)는 유지되지 않는다</li>
	</ul>
	
	<h4>F12 네트워크 탭을 꼭 확인</h4>
	
	<form action="ex02_result.jsp">
		<select name="site">
			<option value="https://www.naver.com/">네이버</option>
			<option value="https://www.youtube.com/">유튜브</option>
			<option value="https://www.google.com/">구글</option>
			<option value="ex01.jsp">ex01</option>
		</select>
		
		<button>전송</button>
	</form>
</body>
</html>