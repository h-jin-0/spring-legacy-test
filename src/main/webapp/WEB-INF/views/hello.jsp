<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>Hello 페이지에 오신 것을 환영합니다람뒤통통통 도토리
	아이디 : ${id }
	패스워드 : ${pw }
	</h1>

	<a href="/springlegacy/goodbye?addr=부산&hobby=야구">goodbye페이지로 이동</a>
</body>
</html>
