<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
<style>
	fieldset {
	display: inline;
}
</style>
</head>
<body>
	<h1>EL의 Parameter 접근</h1>
	<hr>
	
	<form>
		<p><input name="name" placeholder="이름" required>
		<p><input name="age" type="number" placeholder="나이" required>
		
		<button>전송</button>
	</form>
	
	<hr>
	
	<fieldset>
		<legend>표현식</legend>
		
		<ul>
			<li>이름 : <%=request.getParameter("name") %></li>
			<li>나이 : <%=request.getParameter("age") %></li>
			<li>나이 + 3 : <%=request.getParameter("age") + 3 %></li>
		</ul>
	</fieldset>
	
	<fieldset>
		<legend>EL</legend>
		
		<ul>
			<li>이름 : ${param.name }</li>
			<li>나이 : ${param.age }</li>
			<li>나이 +3 : ${param.age + 3} </li>
			<%-- EL은 자료형을 알아서 판별한다 --%>
		</ul>
	</fieldset>
	
</body>
</html>