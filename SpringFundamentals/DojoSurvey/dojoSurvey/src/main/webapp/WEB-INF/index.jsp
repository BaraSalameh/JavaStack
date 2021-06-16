<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey Index</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<main>
		<form method="POST" action="/checkForm">
			<div>
				<p>Your Name</p>
				<input type="text" name="name" required>
			</div>
			<div>
				<p>Dojo Location</p>
				<select name="dojoLocation" required>
					<option>San Jose</option>
					<option>Ramallah</option>
					<option>Washinghton</option>
				</select>
			</div>
			<div>
				<p>Favorite Language</p>
				<select name="favoriteLanguage" required>
					<option>Python</option>
					<option>Java</option>
					<option>MERN</option>
					<option>C++</option>
				</select>
			</div>
			<div class="commentDiv">
				<p>Comment(optional)</p>
				<textarea rows="5" cols="15" name="comment"></textarea>
			</div>
			<div class="buttonDiv">
				<input type="submit" value="Button" id="submitButton">
			</div>
		</form>
	</main>
</body>
</html>