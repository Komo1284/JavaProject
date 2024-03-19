<%@page import="service.Hash"%>
<%@page import="model.vo.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% 
	    request.setCharacterEncoding("utf-8");
	
	    // 폼에서 전송된 데이터 받기
	    String userid = request.getParameter("id");
	    String pw = request.getParameter("pw");
	    String pw_check = request.getParameter("pw_check");
	    String nick = request.getParameter("nick");
	    String email = request.getParameter("email");
	    
	    
	
	    // 비밀번호 확인
	    if (!pw.equals(pw_check)) {
	%>
	    <script>
	        alert('입력하신 비밀번호가 일치하지 않습니다.');
	        history.go(-1); // 이전 페이지로 이동
	    </script>
	<%
	    } else {
	        // AccountVO 객체 생성 및 설정
	        AccountVO acc = new AccountVO();
	        acc.setUserid(userid);
	        acc.setUserpw(pw);
	        acc.setNick(nick);
	        acc.setEmail(email);
	        
	        Hash hs = new Hash();
		    String srcPw = acc.getUserpw();		// 원본 PW를 받아
		    String hashPw = hs.getHash(srcPw);	// Hash에 전달
		    
		    acc.setUserpw(hashPw);				// 해시 PW로 세팅 후
	
	        int row = dao.insert(acc);			// DB에 전달
	
	        // 회원가입 결과에 따라 처리
	        if (row != 0) {
	%>
	            <script>
	                alert('회원가입 성공');
	                location.href = 'home.jsp'; // 홈 페이지로 이동
	            </script>
	<%
	        } else {
	%>
	            <script>
	                alert('회원가입 실패');
	                history.go(-1); // 이전 페이지로 이동
	            </script>
	<%
	        }
	    }
	%>
</body>
</html>
