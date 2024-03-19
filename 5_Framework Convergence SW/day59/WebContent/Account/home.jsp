<%@page import="java.util.List"%>
<%@page import="model.AccountDAO"%>
<%@page import="model.vo.AccountVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%
	    AccountVO acc = (AccountVO) session.getAttribute("acc");
	    if (acc != null) {
	%>
	    <h4>현재 접속 : <%=acc.getNick() %>님 로그인 중</h4>
	<%
	    } else {
	%>
	    <h4>로그인 되어 있지 않습니다.</h4>
	<%
	    }
	%>
	
	<%
		List<AccountVO> list = dao.selectAll();
	%>
	
	<table>
		<thead>
			<tr>
				<th>IDX</th>
				<th>ID</th>
				<th>PW</th>
				<th>Nick</th>
				<th>Email</th>
				<th>Join_Date</th>
			</tr>
		</thead>
		<tbody>
			<% for (AccountVO row : list) { %>
			<tr>
				<td><%=row.getIdx()%></td>
				<td><%=row.getUserid() %></td>
				<td><%=row.getUserpw().substring(0, 2) %></td>
				<td><%=row.getNick() %></td>
				<td><%=row.getEmail() %></td>
				<td><%=row.getJoin_date() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
	
	<br>
	
	

</body>
</html>