<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Form 요청 메서드</h1>
	<hr>
	<details>
		<ol>
			<li>GET
				<ul>
					<li>Parameter를 URL에 담아서 전송한다</li>
					<li>요청/응답 속도가 가장 빠르다</li>
					<li>URL에 전송 데이터가 노출되기 때문에 민감한 정보 전달엔 부적합</li>
				</ul>
			</li>
			<li>POST
				<ul>
					<li>Parameter를 HTTP Header라는 부분에 담아서 전송한다</li>
					<li>GET 보단 느리다</li>
					<li>URL에 데이터가 노출 되지 않고 길이 제한이 딱히 없다</li>
				</ul>
			</li>
		</ol>
	</details>
	
	<fieldset>
		<legend>GET</legend>
		<%-- method에 GET은 기본값이라 생략 가능 --%>
		<form action="ex02_result.jsp" method="GET">
				
				<p><input name="name" placeholder="이름"></p>
				<p><input name="email" type="email" placeholder="이메일"></p>
				
				<button>전송</button>
		</form>
	</fieldset>
	
	<fieldset>
		<legend>POST</legend>
		<%-- method에 GET은 기본값이라 생략 가능 --%>
		<form action="ex02_result.jsp" method="POST">
				
				<p><input name="name" placeholder="이름"></p>
				<p><input name="email" type="email" placeholder="이메일"></p>
				
				<button>전송</button>
		</form>
	</fieldset>
	
</body>
</html>