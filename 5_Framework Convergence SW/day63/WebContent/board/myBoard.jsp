<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<jsp:useBean id="dao" class="model.BoardDAO"/>
	<jsp:useBean id="user" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="user"/>
	<c:set var="list" value="${dao.selectmyBoard(user.nick) }"/>
	

	<main>
		
		<h3>내가 쓴 글</h3>
		<hr>
		
		<table>
			<thead>
				<tr>
					<th>No</th>
					<th>제목</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="row" items="${list }">
				<tr>
					<td>${row.idx }</td>
					<td class="titlelist">
						<a href="${cpath }/board/view.jsp?idx=${row.idx }">${row.title }</a>
					</td>
					<td>${row.view_count }</td>
					<td>${row.w_date }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>

<%@ include file="../footer.jsp"%>