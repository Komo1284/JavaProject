<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<ul>
		<li>${row.idx } ${row.title }</li>
		<li>${row.nick } | ${row.v_count } | ${row.w_date }</li>
		<li>${row.contents }</li>
	</ul>

</body>
</html>