<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table>
		<tr>
			<td colspan="6">${row.idx } ${row.title }</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${row.nick }</td>
			<td>조회수</td>
			<td>${row.v_count }</td>
			<td>작성일</td>
			<td>${row.w_date }</td>
		</tr>
		<tr>
			<td colspan="6"><pre>${row.contents }</pre></td>
		</tr>
	</table>

</body>
</html>