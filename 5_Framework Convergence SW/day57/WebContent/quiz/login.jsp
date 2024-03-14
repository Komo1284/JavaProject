<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	
	<%request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%!
		Account[] db = {
			new Account("itbank", "it12", "아이티뱅크", "홍길동"),	
			new Account("test1", "test", "테스트", "김민지"),	
			new Account("kr1284", "9512", "Komo", "서강혁")	
		};
	
		Account login(Account acc) {
			for (int i = 0; i < db.length; i++) {
				if (db[i].equals(acc)) {
					return db[i];
				}
			}
			
			return null;
		}
	%>
	
		
	<%
		acc = login(acc);
		if(acc == null) {
	%>
		<script>
			alert("로그인정보가 잘못되었습니다.");
			location.href = 'home.jsp';
		</script>
	<%
		}
		else{
			session.setAttribute("user", acc);
			response.sendRedirect("home.jsp");
		}
	%>
</body>
</html>