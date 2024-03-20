<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	
	<h4>${param.name }님은  ${param.age >= 18 ? '성인' : '미성년자' }입니다</h4>
	
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
	
		Cookie[] cs = {
				new Cookie("age", age),
				new Cookie("name", name)
				};
	
		for (int i = 0; i < cs.length; i++) {
			cs[i].setMaxAge(3600);
			response.addCookie(cs[i]);
		}
		
	%>
	
</body>
</html>