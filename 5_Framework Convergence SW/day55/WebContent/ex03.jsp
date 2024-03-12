<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
</head>
<body>
	<h1>여러 input 타입</h1>
	<hr>
	
	<form action="ex03_result.jsp" method="post">
		<p><input name="userid" type="text" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		<p><input name="email" type="email" placeholder="이메일"></p>
		<p>
			<input name="gender" type="radio" value="man">남
			<input name="gender" type="radio" value="woman">여
			<input name="gender" type="radio" value="notting" checked>선택x
		</p>
		
		<p>
			<input name="hobby" type="checkbox" value="game">게임
			<input name="hobby" type="checkbox" value="book">독서
			<input name="hobby" type="checkbox" value="movie">영화
			<input name="hobby" type="checkbox" value="music">음악
		</p>
		
		<p>
			<select name="major">
				<option value="com">컴퓨터공학</option>
				<option>기계공학</option>
				<option>회계학</option>
				<option>국어국문학</option>
				<option>건축학</option>
			</select>
		</p>
		
		<p><input name="upload" type="file"></p>
		<p><textarea name="info" rows="5" cols="15" placeholder="자기소개"></textarea></p>
		
		<button>전송</button>
	</form>
</body>
</html>