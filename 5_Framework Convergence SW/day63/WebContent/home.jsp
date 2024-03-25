<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<%-- jsp:useBean은 Java 객체를 생성하고 Attribute에도 저장된다 --%>
<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="map" value="${dao.selectAll(param.page) }"/>

<c:set var="list" value="${map['list'] }"/>
<c:set var="pg" value="${map['pg'] }"/>

	<main>
		
		<h3>게시글 목록</h3>
		<p>총 게시글 수 : ${pg.totalBoard }</p>
		<hr>
		
		<table>
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
					<td class="titlelist">
						<a href="board/view.jsp?idx=${row.idx }">${row.title }</a>
					</td>
					<td>${row.nick }</td>
					<td>${row.view_count }</td>
					<td>${row.w_date }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	
	<ul class ="page">
		<c:if test="${pg.prev }">
			<li><a href="${cpath }/home.jsp?page=${pg.begin -1 }">이전</a></li>
		</c:if>
		<c:forEach var="i" begin="${pg.begin }" end="${pg.end}">
			
			<li><a href="${cpath }/home.jsp?page=${i }">
				${i }
			</a></li>
		</c:forEach>
		<c:if test="${pg.next }">
		<li><a href="${cpath }/home.jsp?page=${pg.end +1 }">다음</a></li>
		</c:if>
	</ul>
	</main>

<%@ include file="footer.jsp"%>