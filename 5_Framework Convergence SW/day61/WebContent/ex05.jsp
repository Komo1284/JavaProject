<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05.jsp</title>
</head>
<body>
	<h1>EL에서 사용 가능한 연산자</h1>
	<hr>
	
	<ul>
		<li>\${10 + 3 } = ${10 + 3 }</li>
		<li>\${10 - 3 } = ${10 - 3 }</li>
		<li>\${10 * 3 } = ${10 * 3 }</li>
		<li>\${10 / 3 } = ${10 / 3 }</li>
		<li>\${10 % 3 } = ${10 % 3 }</li>
		<li>\${10 > 10 } = ${10 > 10 }</li>
		<li>\${10 >= 10 } = ${10 >= 10 }</li>
		<li>\${10 < 10 } = ${10 lt 10 }</li>	<%-- lt : less than, ~보다 작다 --%>
		<li>\${10 <= 10 } = ${10 le 10 }</li>	<%-- le : less equal, ~보다 작거나 같다 --%>
		<li>\${10 == 10 } = ${10 == 10 }</li>
		<li>\${10 != 10 } = ${10 != 10 }</li>
		<li>\${true && true } = ${true and true }</li>
		<li>\${true || true } = ${true or true }</li>
		<li>\${not true } = ${not true }</li>
		<li>\${empty user } = ${empty user }</li>
		<li>\${not empty user } = ${not empty user }</li>
		<%-- 지칭 이름의 Attribute가 있는지 판별 --%>
		
		<li>\${10 % 2 == 0 ? '짝수' : '홀수' } = ${10 % 2 == 0 ? '짝수' : '홀수' }</li>
	</ul>

</body>
</html>