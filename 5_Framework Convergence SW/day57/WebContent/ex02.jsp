<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	<h1>Cookie 쿠키</h1>
	<hr>
	
	<ul>
		<li>정보를 유지하기 위해서 서버가 클라이언트에 발급하는 객체</li>
		<li>Cookie는 Key와 Value로 이루어져 있다</li>
		<li>서버가 Cookie를 생성 후 클라이언트에 발급하면 이를 클라이언트 하드디스크에 저장</li>
		<li>다음번 서버에 접속시 클라이언트는 이 Cookie를 가지고 방문</li>
		<li>서버는 Cookie 여부에 따라서 다른 응답을 해줄 수 있다</li>
	</ul>
	
	<%
		// 클라이언트가 가지고 온 쿠키 확인
		Cookie[] cs = request.getCookies();
		String name, jsid, save;
		
		name = jsid = "";
		save = "";
	
		// 해당 사이트 처음 방문시 쿠키가 하나도 없을 수 있다
		if (cs != null) {
			for (int i = 0; i < cs.length; i++) {
				switch(cs[i].getName()) {
				case "name" :
					name = cs[i].getValue();
					break;
				case "JSESSIONID" :
					jsid = cs[i].getValue();
					break;
				case "save" :
					save = cs[i].getValue();
					break;
				}
			}
		}
	%>
	
	<p>jsid = <%=jsid %></p>
	
	<form action="ex02_result.jsp" method="post">
		<p><input name="name" placeholder="이름" value="<%=name %>" required></p>
		<p><input name="save" type="checkbox" value="yes" <%=save %>>쿠키 발급</p>
		
		<button>전송</button>
	</form>
</body>
</html>