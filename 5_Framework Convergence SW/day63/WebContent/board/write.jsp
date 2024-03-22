<%@page import="model.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

	<main class="board">
		<form action="writePro.jsp">
			<h2><input name="title" placeholder="제목 (최대30자)"></h2>
			<p>작성자 : ${user.nick }</p>
			<hr>
			<p><input name="nick" type="hidden" value="${user.nick }"></p>
			<textarea name="contents" placeholder="바른말을 사용합시다~"></textarea>
			
			<br>
			
			<section class="sub">
				<p><button>작성하기</button></p>
			</section>
		</form>
		
		
		
	</main>
	

<%@ include file="../footer.jsp"%>