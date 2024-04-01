<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>
	
	<article>
		<form method="POST">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			
			<button>로그인</button>
		</form>
		<br>
		<a href="${cpath }/account/findId"><button>ID찾기</button></a>
		<a href="${cpath }/account/findPw"><button>PW찾기</button></a>
	</article>
	
	<c:if test="${not empty userid }">
		<script>
			alert('${user.nick}님 환영합니다.');
			location.href='${cpath}';
		</script>
	</c:if>
	
</main>
</body>
</html>