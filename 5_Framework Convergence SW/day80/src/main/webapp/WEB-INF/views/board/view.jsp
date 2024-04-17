<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<ul>
		<li>${row.idx } ${row.title }</li>
		<li>${row.nick } | ${row.v_count } | ${row.w_date }</li>
		<li>${row.contents }</li>
	</ul>
	
	<c:if test="${user.nick == row.nick || user.idx == 1001}">
		<a href="${cpath }/board/update/${row.idx }">
			<button>수정</button> 
		</a>
		<a href="${cpath }/board/delete/${row.idx }">
			<button>삭제</button>
		</a>
	</c:if>

</body>
</html>