<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%
		AccountVO acc = (AccountVO)session.getAttribute("acc");
	
		if(acc == null) {
			acc = new AccountVO();
			response.sendRedirect("login.jsp");
		}
	%>

	<table>
		<thead>
			<tr>
				<th>IDX</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>닉네임</th>
				<th>이메일</th>
				<th>가입일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%=acc.getIdx()%></td>
				<td><%=acc.getUserid() %></td>
				<td><%=acc.getUserpw() %></td>
				<td><%=acc.getNick() %></td>
				<td><%=acc.getEmail() %></td>
				<td><%=acc.getJoin_date() %></td>
			</tr>
		</tbody>
	</table>
	
	<br>
	
	<a href="upInput.jsp?idx=<%=acc.getIdx() %>"><button>회원정보 수정</button></a>
	<a href="delete.jsp?idx=<%=acc.getIdx() %>"><button>회원탈퇴</button></a>

</body>
</html>