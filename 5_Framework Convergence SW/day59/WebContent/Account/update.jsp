<%@page import="service.Hash"%>
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
	    String sidx = request.getParameter("idx");
	    int idx = Integer.parseInt(sidx);
	    
	    
	
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
	        
	        Hash hs = new Hash();
		    String hashPw = hs.getHash(pw);
		    
	        acc.setUserid(userid);
	        acc.setUserpw(hashPw);
	        acc.setNick(nick);
	        acc.setEmail(email);
	        acc.setIdx(idx);
	
	        int row = dao.update(acc, idx);
	
	        // 회원가입 결과에 따라 처리
	        if (row != 0) {
	%>
	            <script>
	                alert('회원정보수정 성공');
	                location.href = 'home.jsp'; // 홈 페이지로 이동
	            </script>
	<%
	        } else {
	%>
	            <script>
	                alert('회원정보수정 실패');
	                history.go(-1); // 이전 페이지로 이동
	            </script>
	<%
	        }
	    }
	%>
</body>
</html>