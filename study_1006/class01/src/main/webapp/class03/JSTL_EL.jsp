<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL & EL</title>
</head>
<body>
	<c:set var="name" value="철수"/>
	<c:set var="age" value="20"/>
	
	<p>이름 : ${name}</p>
	<p>나이 : ${age}</p>
	
	<c:if test="${age >=20}">
		<p>성인입니다.</p>
	</c:if>
	
	<c:set var="numbers" value="1,2,3,4,5,6,7,8,9"/>
	
	<ul>
		<c:forEach items="${numbers}" var="number">
			<li>${number}</li>
		</c:forEach>
	</ul>
</body>
</html>