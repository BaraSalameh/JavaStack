<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Person</title>
	<style type="text/css">
		div.container{
			margin:0 auto;
			max-width: 800px;
			display:flex;
			flex-direction:column;
			align-items:center;
		}
		header h1{
			font-size:5em;
		}
		form input{
			margin-top:20px;
		}
		form input#createButton{
			font-size:1em;
			border-radius:10px;
		}
		footer{
			text-align:center;
			margin-top:50px;
		}
		footer a:hover{
			color:green;
			font-size:2em;
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1>New Person</h1>
		</header>
		<main>
			<form:form action="/addNewPerson" method="POST" modelAttribute="persons">
				<p>
					<form:label path="firstName">First Name</form:label>
					<form:errors path="firstName"/>
					<form:input path="firstName"/>
				</p>
				<p>
					<form:label path="lastName">Last Name</form:label>
					<form:errors path="lastName"/>
					<form:input path="lastName"/>
				</p>
				<input type="submit" value="Create" id="createButton">
			</form:form>
		</main>
		<footer>
			<h2><a href="/licenses/new">Create License</a></h2>
		</footer>
	</div>
</body>
</html>