<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
</head>
<body>
	<h1>로그인</h1>
	
	<form method="post" action="/Class01/logincontroller">
		<label for="username">ID : </label>
		<input type="text" id="username" name="username"><br>
		<label for="password">비밀번호 : </label>
		<input type="password" id="password" name="password"><br>
		
		<button type="submit">로그인</button>
	</form>
</body>
</html>