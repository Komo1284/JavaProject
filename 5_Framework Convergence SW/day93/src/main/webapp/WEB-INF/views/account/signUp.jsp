<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST">
		<p><input name="userid" placeholder="아이디" required></p>
		<p><input name="userpw" type="password" placeholder="패스워드" required></p>
		<p><input name="userpw" type="password" placeholder="패스워드 확인" required></p>
		<p><input name="nick" placeholder="닉네임" required></p>
		<p><input name="email" type="email" placeholder="이메일" required></p>
		
		<button>가입</button>
	</form>

	<p><!-- 여기에 메세지를 출력 --></p>

	<script>
		let userpw = document.getElementsByName("userpw");
		let msg = '';
		
		userpw[1].onblur = () => {

			if (userpw[0].value == userpw[1].value) {
				msg = '패스워드가 일치 합니다~';
			}
			else {
				msg = '패스워드가 다릅니다!!!';
				userpw[0].value = userpw[1].value = '';
				userpw[0].focus();
			}
		document.querySelectorAll("p")[5].innerHTML = msg;
		
		let userid = document.getElementsByName("userid")[0];

		userid.onblur = () => {
			alert('서버에 id가 있는지 전송~')
		}
		}

	</script>

</body>
</html>