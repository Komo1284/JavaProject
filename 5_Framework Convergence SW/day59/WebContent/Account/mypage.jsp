<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%
		AccountVO acc = (AccountVO)session.getAttribute("acc");
	
		if(acc == null) {
			acc = new AccountVO();
		}
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

</body>
</html>