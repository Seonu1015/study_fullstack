<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 배열 사용 -->

	<%!
		String[] names = {"Adam", "Bobby", "Chris", "Danny"};
		int[] ages = {18, 20, 17, 21};
	%>
	<%
		request.setAttribute("names", names);
		request.setAttribute("ages", ages);
	%>
	
	<c:forEach var="i" begin="0" end="<%= names.length - 1 %>">
		<c:if test="${ages[i]>=20}">
			<p>이름 : ${names[i]}</p>
			<p>나이 : ${ages[i]}</p>
		</c:if>
	</c:forEach>
		
	
	<!-- Map 사용 -->
	
	<%@ page import="java.util.HashMap" %>
	<%@ page import="java.util.Map" %>
	
	<%!
		Map<String, Integer> people = new HashMap<>();
		{
			people.put("Adam", 19);
			people.put("Bobby", 20);
			people.put("Chris", 21);
			people.put("Danny", 17);
			
		}
	%>
	<%
		request.setAttribute("people", people);
	%>
	
	<c:forEach var="entry" items="${people.entrySet()}">
		<c:if test="${entry.value >= 20}">
			<p>${entry.key}, ${entry.value}</p>
		</c:if>
	</c:forEach>
	
	
</body>
</html>