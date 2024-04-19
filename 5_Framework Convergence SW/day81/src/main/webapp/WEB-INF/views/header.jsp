<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>  
<style>
	
	a{
		color: inherit;
		text-decoration: none;
	}
	a:hover{
		text-decoration: underline;s
	}
	.menu {
		display: flex;
		list-style: none;
		padding: 0;
	}
	.menu > li {
		margin: 0 15px;
	}
	table{
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
	.page{
		list-style: none;
		padding: 0;
		display: flex;
	}
	.page > li {
		margin: 0 10px;
	}
	.reply {
		margin: 10px 0;
		width: 500px;
		box-sizing: border-box;
	}
	.replyWrite {
		height: 60px;
		width: 500px;
		display: flex;
		border: 1px solid #a0a0a0;
		box-sizing: border-box:
	}
	.replyWrite > * {
		border: 0;
		outline: none;
	}
	.replyWrite textarea{
		width: 90%;
		resize: none;
	}
	.replyWrite > button {
		width: 10%;
	}
</style>
</head>
<body>
	<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
	<c:set var="signUp" value="${empty user ? 'signUp' : 'myPage' }"/>

	<h1>Test</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">ex01</a></li>
		<li><a href="${cpath }/ex02">ex02</a></li>
		<li><a href="${cpath }/board/list">board</a></li>
		<li><a href="${cpath }/board/reply">reply</a></li>
		<li><a href="${cpath }/account/list">account</a></li>
		<li><a href="${cpath }/account/${login}">${login }</a></li>
		<li><a href="${cpath }/account/${signUp}">${signUp }</a></li>
	</ul>
	
	<hr>