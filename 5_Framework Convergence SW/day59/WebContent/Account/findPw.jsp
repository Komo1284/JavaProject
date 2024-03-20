<%@page import="service.Hash"%>
<%@page import="service.NewPw"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		
		String newPw = "일치하는 정보가 없습니다";
		
		// 1. 일치하는 정보가 있으면 임시 패스워드를 생성 후 발급
		if (acc != null) {
			NewPw np = new NewPw();
			newPw = np.getPw();
			
			Hash hs = new Hash();
		    String newhashPw = hs.getHash(newPw);
			
		    String pw = dao.findPw(acc.getUserid(), acc.getEmail());
		    acc.setUserpw(pw);
		    
		    int row = dao.changePw(acc, newhashPw);
		    if(row != 0) {
				// 2-1. 사용자에게는 해시 처리 전의 패스워드를 보여주고
	    	%>		<script>
	    				let newPw = '<%= newPw%>';
	    				
	    				if (pw != 'null') {
	    					alert('임시발급 패스워드는 ' + newPw + ' 입니다');
	    					location.href('home.jsp');
	    				}
	    				else {
	    					alert('일치하는 정보가 없습니다');
	    					history.go(-1);
	    				}
	    				
	    			</script>
	    	<%
		    }
			
	
			// 2-2. DB는 해시 처리 후의 패스워드로 수정한다
		}
	%>

</body>
</html>