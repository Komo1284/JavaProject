<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main class="home">
	<%@ include file="sideMenu.jsp" %>
<c:set var="list" value="${map['list'] }"/>
<c:set var="pg" value="${map['pg'] }"/>
<article>
	<table class="board">
		<thead>
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		</thead>
	
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td><a href="${cpath }/board/view?idx=${row.idx}">${row.title }</a></td>
				<td>${row.nick }</td>
				<td>${row.v_count }</td>
				<td>${row.w_date }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br>
	<h4><a href="${cpath }/board">
		<button>글쓰기</button>	
	</a></h4>
	
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
</article>
	
</main>

	

</body>
</html>