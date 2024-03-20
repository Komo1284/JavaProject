<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>
<style>
	fieldset {
		display: inline;
	}
	table {
		border: solid black 1px;
		border-collapse: collapse;
		padding: 10px;
	}
	th {
		border: solid black 1px;
		padding: 10px;
	}
</style>
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	
	<ul>
		<li>사용자에게 구구단을 입력 받아서 현재 페이지에 출력</li>
		<li>JSTL/EL을 최대한 활용할 것</li>
	</ul>
	
	
	<fieldset>
		<legend>구구단 계산기</legend>
		<form>
			<p><input name="num" type="number" placeholder="단수를 입력해주세요." required>
		<button>확인하기</button>
	</form>
		
	</fieldset>
	
	<br>
	
	<%

	%>
	
	<br>
	
	<table>
		<c:if test="${not empty param.num }">
			<c:forEach var="i" begin="1" end="9">
				<tr>
					<th>${param.num } x ${i }</th>
					<th>${param.num * i }</th>
				</tr>
			</c:forEach>
		</c:if>
		
	</table>
	
</body>
</html>