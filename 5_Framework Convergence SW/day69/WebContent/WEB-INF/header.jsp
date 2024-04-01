<%@page import="model.vo.AccountVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link href="${cpath }/css/style.css" rel="stylesheet">
</head>
<body>
<header>

	<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
	<c:set var="nick" value="${empty user ? 'signUp' : user.nick }"/>
	<c:set var="signup" value="${empty user ? 'signUp' : 'myPage' }"/>
	
	
	<h1>${cpath }</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/account">user</a></li>
		<li><a href="${cpath }/account/${login }">${login }</a></li>
        <li><a href="${cpath }/account/${signup }">${nick }</a></li>
	</ul>
</header>
<hr>