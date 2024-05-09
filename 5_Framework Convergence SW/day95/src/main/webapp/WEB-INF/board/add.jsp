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
	


	<form method="post">
		
		<p><input name="title" placeholder="제목" required></p>
		<p><input name="user_idx" type="hidden" value="1001" required></p>
			<textarea name="contents"></textarea>
		
		<p><button>작성하기</button></p>
		
	</form>
	
</body>
</html>