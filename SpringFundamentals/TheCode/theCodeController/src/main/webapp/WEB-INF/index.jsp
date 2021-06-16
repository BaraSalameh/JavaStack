<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Secret Code</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<main>
		<p> <c:out value="${error}"/> </p>
		<h1>What is the Code?</h1>
		<form action="/checkCode" method="POST">
			<input type="text" name="code">
			<input type="submit" value="Try Code">
		</form>
	</main>
</body>
</html>