<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey Result</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<main>
		<div>
			<h1>Submitted Info</h1>
		</div>
		<div>
			<p>name :</p>
			<p><c:out value="${name}"/></p>
		</div>
		<div>
			<p>Dojo Location :</p>
			<p><c:out value="${dojoLocation}"/></p>
		</div>
		<div>
			<p>Favorite Language :</p>
			<p><c:out value="${favoriteLanguage}"/></p>
		</div>
		<div>
			<p>Comment :</p>
			<p><c:out value="${comment}"/></p>
		</div>
	</main>
	<footer>
		<div>
			<form action="/" method="GET">
				<input type="submit" value="Back" id="submitButton">
			</form>
		</div>
	</footer>
</body>
</html>