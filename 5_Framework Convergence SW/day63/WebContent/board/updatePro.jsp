<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<jsp:useBean id="input" class="model.vo.BoardVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<jsp:useBean id="dao" class="model.BoardDAO"/>
	<c:set var="row" value="${dao.update(input) }"/>

	<script>
		let row = ${row };
		
		if (row != 0) {
			alert('게시글이 변경 되었습니다');
			location.href = '${cpath}';
		}
		else {
			alert('변경 실패');
			history.go(-1);
		}
	</script>

</body>
</html>