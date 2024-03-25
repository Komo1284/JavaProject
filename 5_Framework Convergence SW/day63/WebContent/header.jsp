<%@page import="model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>
<link href="${cpath }/css/style.css" rel="stylesheet">
</head>
<body>


	<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
	<c:set var="nick" value="${empty user ? 'signUp' : user.nick }"/>
	<c:set var="signup" value="${empty user ? 'signUp' : 'myPage' }"/>


<header class="main-header">
    <h1 class="logo">ITBANK</h1>
    <nav class="main-nav">
        <ul>
            <li><a href="${cpath }/home.jsp">Home</a></li>
            <li><a href="${cpath }/board/write.jsp">Write</a></li>
            <li><a href="${cpath }/account/${login }.jsp">${login }</a></li>
            <li><a href="${cpath }/account/${signup }.jsp">${nick }</a></li>
        </ul>
    </nav>
</header>

