<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<!-- Place the first <script> tag in your HTML's <head> -->
	<script src="https://cdn.tiny.cloud/1/bmpz83s4yqa4fgfuozripnlgp9hjdztmwwmpnqkfnjhs8r39/tinymce/7/tinymce.min.js" referrerpolicy="origin"></script>
	
	<!-- Place the following <script> and <textarea> tags your HTML's <body> -->
	<script>
	  tinymce.init({
	    selector: 'textarea',
	    plugins: 'anchor autolink charmap codesample emoticons image link lists media searchreplace table visualblocks wordcount linkchecker',
	    toolbar: 'undo redo | blocks fontfamily fontsize | bold italic underline strikethrough | link image media table | align lineheight | numlist bullist indent outdent | emoticons charmap | removeformat',
	  });
	</script>

	<form method="POST">
		<p><input name="title" value="${row.title }" placeholder="제목" required></p>
		<p><input name="user_idx" value="1001" readonly type="number" placeholder="유저번호" required></p>
		<p><textarea name="contents" placeholder="내용">${row.contents }</textarea></p>
		
		<button>전송</button>
	</form>

</body>
</html>