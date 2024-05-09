<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr>
			<td>글번호</td>
			<th>${bd.idx }</th>
		</tr>
		<tr>
			<td>제목</td>
			<th>${bd.title }</th>
		</tr>
		<tr>
			<td>작성자</td>
			<th>${bd.nick }</th>
		</tr>
		<tr>
			<td>조회수</td>
			<th>${bd.v_count }</th>
		</tr>
		<tr>
			<td>내용</td>
			<th>${bd.contents }</th>
		</tr>
	</table>
	
	<a href="/board/update?idx=${bd.idx }"><button>수정</button></a>
	<a href="delete?idx=${bd.idx }"><button>삭제</button></a>
	
</body>
</html>