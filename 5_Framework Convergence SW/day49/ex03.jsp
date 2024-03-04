<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
<style type="text/css">
	* {
		font-family: "consolas";
	}
</style>
</head>
<body>
	<h1>JSP 기초 태그</h1>
	<hr>
	
	<!--  HTML 주석 : 웹 브라우저 소스 보기로 노출된다 -->
	<%-- JSP 주석 : 소스보기에 노출되지 않는다 --%>
	
	<ol>
		<li>지시자(directive) : &lt;%@ %> 페이지 전반에 걸처 설정이나 외부 JSP를 import시 사용</li>
		<li>선언부(declaration) : &lt;%! %> 필드나 메서드를 선언하는 구간</li>
		<li>표현식(expression) : &lt;%= %> 자바의 데이터 HTML 영역에 출력</li>
		<li>실행부(scriptlet) : &lt;% %> 지역변수 선언이나 실행코드를 작성</li>
	</ol>
	
	<%!	// 여기는 Java 영역
		// - 필드 선언 및 메서드 선언에 사용
		// - private 같은 지시자가 붙었다? 멤버네~
		private int n1 = 10;
		
		public int adder(int n1, int n2){
			return n1 + n2;
		}
	
	%>
	
	<ul>
		<li>n1 = <%=n1 %></li>
		<li>n1 + 4 = <%=n1 + 4 %></li>
		<li>adder(5, 1) = <%=adder(5, 1) %></li>
	</ul>
	
	<%	// 실행부
		// - java에서 main 쯤으로 취급하면 된다
		// - 지역변수 선언이나 제어문을 사용 가능
		int n2 = 20;
	
		for (int i = 1; i <= 3; i++){
			// System.out.println(i + " : Hello World!!!");
			// - System의 out은 표준 출력 객체. 즉, 콘솔에 출력
			
			out.println("<p>" + i + " : Hello World!!!</p>");
			// - JSPWriter out : JSP 내장객체
			// - 웹 브라우저에 데이터를 출력하는 객체
		}
	
	%>
</body>
</html>