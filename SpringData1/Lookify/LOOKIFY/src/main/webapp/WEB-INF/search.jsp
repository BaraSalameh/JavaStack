<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>      
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Search</title>
</head>
<body>
	<div class="container">
		<header>
			<div>
				<c:forEach items="${artist}" var="art">
					<h2>Songs by artist: ${art.artist}</h2>
				</c:forEach>
			</div>
			<div>
				<form:form action="/search" method="POST">
					<input name="artist">
					<input type="submit" value="New Search">
				</form:form>
			</div>
			<div>
				<a href="/dashboard">Dashboard</a>
			</div>
		</header>
		<main>
			<table>
				<thead>
					<tr>
						<td>Name</td>
						<td>rating</td>
						<td>actions</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${artist}" var="art">
						<tr>
							<td>${art.title}</td>
							<td>${art.rating}</td>
							<td><a href="/delete/${art.id}/${art.artist}">delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</main>
	</div>
</body>
</html>