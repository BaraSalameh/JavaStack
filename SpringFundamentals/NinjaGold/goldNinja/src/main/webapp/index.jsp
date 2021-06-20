<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Ninja Gold</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<main>
		<div class="mainHeaderDiv">
			<h1>Your Gold: <input type="text" value=" <c:out value= '${golds}'/> "> </h1>
		</div>
		<div class="mainMainDiv">
			<div class="mainPlaceDiv">
				<h1>Farm</h1>
				<p>(earns 10-20 gold)</p>
				<form method="POST" action="/place">
					<input type="hidden" name="hidden" value="1">
					<input type="submit" value="Find gold">
				</form>
			</div>
			<div class="mainPlaceDiv">
				<h1>Cave</h1>
				<p>(earns 5-10 gold)</p>
				<form method="POST" action="/place">
					<input type="hidden" name="hidden" value="2">
					<input type="submit" value="Find gold">
				</form>
			</div>
			<div class="mainPlaceDiv">
				<h1>House</h1>
				<p>(earns 2-5 gold)</p>
				<form method="POST" action="/place">
					<input type="hidden" name="hidden" value="3">
					<input type="submit" value="Find gold">
				</form>
			</div>
			<div class="mainPlaceDiv">
				<h1>Casino</h1>
				<p>(earns 0-50 gold)</p>
				<form method="POST" action="/place">
					<input type="hidden" name="hidden" value="4">
					<input type="submit" value="Find gold">
				</form>
			</div>
		</div>
		<div class="mainFooterDiv">
			<div>
				<h1>Activities:</h1>
			</div>
			<div>
				<textarea rows="10" cols="50" name="activities">
					<c:out value="${status}"/>
				</textarea>
			</div>
		</div>
	</main>
</body>
</html>