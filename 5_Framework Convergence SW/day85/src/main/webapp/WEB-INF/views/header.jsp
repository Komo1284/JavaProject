<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<c:set var="login" value="${not empty user ? 'logout' : 'login' }"/>
<c:set var="myPage" value="${not empty user ? 'myPage' : 'signUp' }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>

<link href="${cpath }/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<h1>Board</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/account/list">account</a></li>
		<li><a href="${cpath }/account/${login}">${login}</a></li>
		<li><a href="${cpath }/account/${myPage}">${myPage}</a></li>
	</ul>
	
	<hr>