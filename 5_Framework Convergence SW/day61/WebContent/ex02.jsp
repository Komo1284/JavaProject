<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.vo.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
</head>
<body>
	
	<%
		Person hong = new Person("홍길동", 25);
		Person lee = new Person("이수진", 31);
	
		pageContext.setAttribute("hong", hong);
		request.setAttribute("lee", lee);
		
		List<Person> list = new ArrayList<>();
		
		list.add(hong);
		list.add(lee);
		
		session.setAttribute("list", list);
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("p1", hong);
		map.put("p2", lee);
		
		application.setAttribute("map", map);
		
		// 겹치는 Attribute 이름을 추가
		request.setAttribute("hong", new Person("홍진호", 22));
	%>
	
	<h1>EL Attribute 접근</h1>
	<hr>
	
	<h4>표현식 사용시</h4>
	
	<ul>
		<li><%=((Person)pageContext.getAttribute("hong")).getName() %></li>
		<li><%=pageContext.getAttribute("kim") %></li>
		<%-- 없는 Attribute인 경우 null이 반환 -> 이때, 멤버 참조시 널포인터 예외 발생 --%>
		<li><%=((Person)request.getAttribute("lee")).getName() %></li>
		<li><%=((List<Person>)session.getAttribute("list")).get(0).getName() %></li>
		<li><%=((Person)((Map<String, Object>)application.getAttribute("map")).get("p2")).getName() %></li>
		
		<li><%=((Person)request.getAttribute("hong")).getName() %></li>
		
	</ul>
	
	<h4>EL 사용시</h4>
	
	<ul>
		<li>${hong.getName() }</li>
		<li>${kim }</li> 			
		<%-- El은 널을 출력하지 않음. 따라서, Attribute가 없어도 널포인터 예외 발생하지 않음 --%>
		<li>${lee.name }</li>
		<%-- EL은 필드명을 작성하면 자동으로 getter를 호출하게 되어있다 --%>	
		
		<li>${list[0].name }</li>
		<li>${map['p2'].name }</li>
		<%-- EL은 List, Map 접근시 배열처럼 []를 제공한다 --%>	
		
		<li>${hong.name }</li>
		<%-- EL은 pageContext부터 순서대로 탐색. 즉, 이름이 겹치면 항상 앞의 영역이 꺼내짐 --%>
		
		<li>${requestScope.hong.name }</li>
		<%-- 영역명을 명시해서 정확히 꺼낼 수 있지만, 구문이 길어져 권장하지 않음 --%>
	</ul>
	
</body>
</html>