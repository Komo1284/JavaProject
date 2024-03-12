<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_result.jsp</title>
</head>
<body>
	
	<%!
		String ids[] = { "itbank", "test1", "root"};
		String pws[] = { "it12", "1234", "qwe" };
		String nicks[] = { "아이티뱅크", "테스트", "루트"};
	%>
	
	<%request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	<jsp:setProperty name="acc" property="*" />
	
	<%
		
		String msg = "존재하지 않는 아이디입니다.";
		
		for(int i = 0; i < ids.length; i++){
			if(ids[i].equals(acc.getId())){
				if(pws[i].equals(acc.getPw())){
					msg = "%s 님 로그인 성공";
					msg = String.format(msg, nicks[i]);
				}
				else{
					msg= "비밀번호가 틀렸습니다.";
				}
			}
		}
		out.println(msg);
	%>
	
</body>
</html>