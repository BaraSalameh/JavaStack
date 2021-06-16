<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<main>
		<h1>You have viseted http://127.0.0.1/8080/ <c:out value="${visits}"/> times</h1>
		<h1><a href="/">Test another visit</a></h1>
		<h1><a href="/thirdPage">Increment by two</a></h1>
	</main>
</body>
</html>