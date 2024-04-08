<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<script>
		let row = ${row};
		
		if (row != 0) {
			alert('${msg}');
			location.href = '${cpath}';
		}
		else {
			alert('${msg}');
			history.go(-1);
		}
	</script>

</body>
</html>