<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<link href="${cpath }/resources/css/style.css" rel="stylesheet">
	<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">Home</a></li>
		<li><a href="${cpath }/ex01">ex01</a></li>
		<li><a href="${cpath }/ex02">ex02</a></li>
		<li><a href="${cpath }/quiz">quiz</a></li>
		<li><a href="${cpath }/ex04/test1">ex04</a></li>
		<li><a href="${cpath }/ex05">ex05</a></li>
		<li><a href="${cpath }/ex05/test1">ex06</a></li>
	</ul>
	
	<hr>