<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<%!
		String ids[] = { "itbank", "test1", "root"};
		String pws[] = { "it12", "1234", "qwe" };
	%>
	
	<%
		String userid = request.getParameter("id");
		String userpw = request.getParameter("pw");
		String msg = "존재하지 않는 아이디입니다.";
		
		for(int i = 0; i < ids.length; i++){
			if(ids[i].equals(userid)){
				if(pws[i].equals(userpw)){
					msg = "로그인에 성공하였습니다.";
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