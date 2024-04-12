<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table>
		<tr>
			<th>IDX</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		<tr>
			<td>${user.idx }</td>	
			<td>${user.userid }</td>	
			<td>${user.nick }</td>	
			<td>${user.email }</td>	
			<td>${user.j_date }</td>	
		</tr>
	</table>

</body>
</html>