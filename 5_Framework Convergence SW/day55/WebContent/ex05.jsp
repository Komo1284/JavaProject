<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
</head>
<body>
	<h1>Java Beans 연습</h1>
	<hr>
	
	<ol>
		<li>ex05.jsp에는 이름, 국 영 수 점수를 받을 form을 작성</li>
		<li>작성된 데이터는 POST로 ex05_result.jsp로 전송한다</li>
		<li>ex05_result에는 전달된 데이터를 받아서 합계 평균을 출력한다</li>
		<li>단, 학생 정보는 beans.Student를 활용해서 받아 보세요</li>
	</ol>
	
	<fieldset>
		<legend>학생정보 입력란</legend>
		
		<form action="ex05_result.jsp">
			<p><input name="name" placeholder="이름을 입력하세요"></p>
			<p><input name="kor" type="number" placeholder="국어점수"></p>
			<p><input name="eng" type="number" placeholder="영어점수"></p>
			<p><input name="mat" type="number" placeholder="수학점수"></p>
			
			<button>전송</button>
		</form>
	</fieldset>
</body>
</html>