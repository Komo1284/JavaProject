<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	<p>${ver }</p>
	
	<table>
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="i" items="${list }">
				<tr>
					<td>${i.idx }</td>
					<td>${i.name }</td>
					<td>${i.kor }</td>
					<td>${i.eng }</td>
					<td>${i.mat }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>