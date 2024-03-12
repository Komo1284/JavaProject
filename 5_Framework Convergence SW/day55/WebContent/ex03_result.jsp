<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_result.jsp</title>
</head>
<body>
	<%
		// 1. getParameter("이름")
		// - 지정 이름의 파라미터 값을 문자열로 반환
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String upload = request.getParameter("upload");
		
	%>
	
	<h1>결과</h1>
	<hr>
	
	<h4>1. getParameter()</h4>
	
	<ul>
		<li><%=userid %></li>
		<li><%=userpw %></li>
		<li><%=email %></li>
		<li><%=gender %></li>
		<li><%=Arrays.toString(hobby) %></li>
		<li><%=major %></li>
		<li><%=upload %></li>
	</ul>
	
	<h4>2. getParameterMap()</h4>
	
	<%
		Map<String, String[]> map = request.getParameterMap();
		Set<String> keys = map.keySet();
		
		out.println("<ul>");
		
		for(String k : keys) {
			String[] values = map.get(k);
			out.println("<li>" + k + " : " + Arrays.toString(values) + "</li>");
		}
		
		out.println("</ul>");
	%>
	
	<h4>3. getParameterNames()</h4>
	
	<%
		// 파라미터의 이름만 모두 반환
		Enumeration<String> em = request.getParameterNames();
	
		out.println("<ul>");
	
		while (em.hasMoreElements()) {
			String k = em.nextElement();
			out.println("<li>" + k + "</li>");
		}

		out.println("</ul>");
	%>
</body>
</html>