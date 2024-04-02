<%@page import="model.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
	
	<main>
		<h2>${row.title }</h2>
		<hr>
		<div class="cotents_view">${row.contents }</div>
		<hr>
		<c:if test="${row.nick == user.nick || user.idx == 1001}">
			<a href="${cpath }/board/update?idx=${row.idx }">
				<button>수정</button>
			</a>
			
			<a href="${cpath }/board/delete?idx=${row.idx }">
				<button>삭제</button>
			</a>
		</c:if>
		<section class="sub">
			<p>게시글 번호 : ${row.idx }</p>
			<p>작성자 : ${row.nick }</p>
			<p>조회수 : ${row.v_count }</p>
			<p>등록일 : ${row.w_date }</p>
		</section>
		
		
		
	</main>

</body>
</html>