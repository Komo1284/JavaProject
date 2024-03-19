<%@page import="java.math.BigInteger"%>
<%@page import="java.security.MessageDigest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>

	<%
		String srcPw = "1"; // 원본 패스워드
		String hashPw;		// 해시 처리 후 패스워드
		
		MessageDigest md = MessageDigest.getInstance("sha-512");
		
		md.reset();						// 이전에 사용한 해시값이 남았을 수 있어 먼저 제거한다.
		md.update(srcPw.getBytes());	// 문자열을 바이트 배열로 변환해서 전달한다
		
		hashPw = String.format("%0128x", new BigInteger(1, md.digest()));
	%>

	<h1>Hash 처리</h1>
	<hr>
	
	<ul>
		<li>해시란 데이터의 무결성을 검증하기 위한 방식을 의미</li>
		<li>또한 암호화 알고리즘에 사용되기도 한다</li>
		<li>해시 처리가 된 후 원래 데이터를 되돌릴 수 없다 (= 일방향성)</li>
		<li>해시 알고리즘에 따라 항상 동일한 길이의 해시값이 얻어진다</li>
	</ul>
	
	<ul>
		<li>해시 처리 전 : <%=srcPw %></li>
		<li>해시 처리 후 : <%=hashPw %></li>
	</ul>
</body>
</html>