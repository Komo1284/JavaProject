<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06.jsp</title>
</head>
<body>
	<%
		// ※ parameter VS attribute
		// 1. parameter : 외부에서 넘어오는 데이터. 개발자가 저장된 내용을 변경할 수 없다
		// 2. attribute : 개발자가 직접 세팅한 데이터. 변경 및 수동 제거 가능
		
	
		// void setAttribute(String name, Object value);
		pageContext.setAttribute("it", new Account("itbank", "it12"));
		request.setAttribute("t1", new Account("test1", "1234"));
		session.setAttribute("rt", new Account("root", "qwe"));
		application.setAttribute("ad", new Account("admin", "@123"));
		
		Account pg = (Account)pageContext.getAttribute("it");
		Account rq = (Account)request.getAttribute("t1");
		Account ss = (Account)session.getAttribute("rt");
		Account ap = (Account)application.getAttribute("ad");
	%>
	
	<h1>Attribute 실습</h1>
	<hr>
	
	<ul>
		<li>page = <%=pg.getId() %></li>
		<li>request = <%=rq.getId() %></li>
		<li>session = <%=ss.getId() %></li>
		<li>application = <%=ap.getId() %></li>
	</ul>
	
	<a href="ex06_result.jsp">
		<button>이동</button>
	</a>
	
	<%-- 포워드는 원래 버튼으로 만들어 쓰는 기능이 아니다 --%>
	<form>
		<input name="forward" type="hidden" value="yes">
		<button>포워드</button>
	</form>
	
	<%
		String forward = request.getParameter("forward");
	
		// 포워드 버튼을 누르면 파라미터가 있다 (즉, null이 아님)
		if(forward != null) {
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("ex06_result.jsp");
			
			rd.forward(request, response);
		}
	%>
</body>
</html>