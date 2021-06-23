<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>          
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Details</title>
	<style type="text/css">
		div.container{
			padding:10px 100px;
		}
		header a{
			float:right;
		}
		div.formRow{
			display:flex;
			justify-content:space-around;
			padding:10px
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<a href="/dashboard">Dashboard</a>
		</header>
		<main>
			<div class="formRow">
					<p>Title</p>
					<c:out value="${artist.title}"/>
				</div>
				<div class="formRow">
					<p>Artist</p>
					<c:out value="${artist.artist}"/>
				</div>
				<div class="formRow">
					<p>Rating(1-10)</p>
					<c:out value="${artist.rating}"/>
				</div>
		</main>
		<footer>
			<form:form action="/delete/${artist.id}/${artist.artist}" method="POST" modelAttribute="playlists">
				<input type="hidden" name="_method" value="DELETE">
				<input type="submit" value="delete">
			</form:form>
		</footer>
	</div>
</body>
</html>