<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
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
		<li><a href="${cpath }/log">log</a></li>
		<li><a href="${cpath }/transaction">transaction</a></li>
		<li><a href="${cpath }">home</a></li>
	</ul>
	
	<hr>