<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index 기본 페이지</h1>
	request : <%=request.getAttribute("index")%><br>
	<a href="login">로그인 페이지</a>
	<a href="logout">로그아웃 페이지</a>
</body>
</html>