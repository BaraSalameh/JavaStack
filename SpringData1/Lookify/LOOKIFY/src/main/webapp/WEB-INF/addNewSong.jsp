<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>      
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Add Song</title>
	<style type="text/css">
		div.headerDiv{
			text-align:right;
			padding-top:10px;
		}
		form{
			margin-top:30px;
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
			<div class="headerDiv">
				<a href="/dashboard">Dashboard</a>
			</div>
		</header>
		<main>
			<form:form action="/addNewSong" method="POST" modelAttribute="playlists">
				<div class="formRow">
					<p>Title</p>
					<form:input path="title"/>
				</div>
				<div class="formRow">
					<p>Artist</p>
					<form:input path="artist"/>
				</div>
				<div class="formRow">
					<p>Rating(1-10)</p>
					<form:input type="number" path="rating" min="1" max="10" value="5"/>
				</div>
				<div class="formRow">
					<input type="submit" value="Add Song">
				</div>
			</form:form>
		</main>
	</div>
</body>
</html>