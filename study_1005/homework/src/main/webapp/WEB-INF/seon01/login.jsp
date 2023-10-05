<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<h1>LOGIN</h1>
	<hr>
	
	<form action="/Seon/user" method="post">
		<input type="hidden" name="action" value="login">
		<input type="text" placeholder="아이디" name="userId"><br>
		<input type="password" placeholder="비밀번호" name="password"><br><br>
		<button type="submit">로그인</button>
	</form>
	<hr>
	<a href="./enroll.html">회원가입</a>
	
</body>
</html>