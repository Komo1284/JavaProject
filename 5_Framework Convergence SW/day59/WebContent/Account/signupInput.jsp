<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
    
    
    <fieldset>
        <legend>회원가입</legend>
        <form action="signup.jsp">
            
            <p><input type="text" name="id" placeholder="아이디" required></p>
            <p><input type="password" name="pw" placeholder="비밀번호" required></p>
            <p><input type="password" name="pw_check" placeholder="비밀번호 확인" required></p>
            <p><input type="text" name="nick" placeholder="닉네임" required></p>
            <p><input type="email" name="email" placeholder="이메일"></p>
            
            <p><button>회원가입</button></p>
        </form>
    </fieldset>
    
    
</body>
</html>
