<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<c:set var="list" value="${map['list'] }"/>
<c:set var="pg" value="${map['pg'] }"/>

	<table>
		<tr>
			<th>IDX</th>
			<th>Title</th>
			<th>닉네임</th>
			<th>조회수</th>
			<th>게시일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="row" items="${bd }">
		<tr>
			<td>${row.idx }</td>
			<td>
			<a href="${cpath }/board/view/${row.idx}">
			${row.title }</a>
			</td>
			<td>${row.nick }</td>
			<td>${row.v_count }</td>
			<td>${row.w_date }</td>
			<th>
				<a href="${cpath }/board/update/${row.idx}">
				√
				</a>
			</th>
			<th>
				<a href="${cpath }/board/delete/${row.idx}">
				√
				</a>
			</th>
		</tr>
	</c:forEach>
	</table>
	
	<ul class="page">
		<c:if test="${pg.prev }">
		<li><a href="${cpath }/home?page=${pg.begin - 1 }">
			이전
		</a></li>
		</c:if>
	
		<c:forEach var="i" begin="${pg.begin }" end="${pg.end }">
		<li><a href="${cpath }/home?page=${i }">
			${i }
		</a></li>
		</c:forEach>
		
		<c:if test="${pg.next }">
		<li><a href="${cpath }/home?page=${pg.end + 1 }">
			다음
		</a></li>
		</c:if>
	</ul>
</body>
</html>
