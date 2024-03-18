<%@page import="model.vo.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String cpath =  request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account 테이블</title>

<link rel="stylesheet" href="<%=cpath %>/css/style.css">
</head>
<body>

	<%
		AccountDAO dao = new AccountDAO();
		AccountVO user = (AccountVO)session.getAttribute("acc");
	
		String login = "logout";
	
		if (user == null) {
			login = "login";
		}
	%>
	
	<header>
		<h1>ITBANK</h1>
		
		<ul class="menu">
			<li><a href="home.jsp">HOME</a></li>
			<%
				if(user != null){
			%>		<li><a href="mypage.jsp">MyPage</a></li>
			<%
				}
			%>
			<li><a href="<%=login %>.jsp"><%=login %></a></li>
			<li><a href="signupInput.jsp">SignUp</a></li>
			
			
		</ul>
	</header>
	
	
	<hr>
