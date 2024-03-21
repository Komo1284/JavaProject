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

<header>
	<h1>ITBANK</h1>
	
	<ul>
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/board/write.jsp">write</a></li>
		<li>login</li>
		<li>signUp</li>
	</ul>
</header>