<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%-- jsp:useBean은 Java 객체를 생성하고 Attribute에도 저장된다 --%>
<jsp:useBean id="dao" class="model.BoardDAO"/>
<c:set var="ver" value="${dao.test() }"/>
<c:set var="list" value="${dao.selectAll() }"/>

<main>
	<h3>${ver }</h3>
	
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
				<td>
					<a href="${cpath }/board/view.jsp?idx=${row.idx }">
						${row.title }
					</a>
				</td>
				<td>${row.nick }</td>
				<td>${row.view_count }</td>
				<td>${row.w_date }</td>
			</tr>
			</c:forEach>
		</tbody>	
	</table>
</main>

<%@ include file="footer.jsp" %>