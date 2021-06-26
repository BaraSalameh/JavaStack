<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Dojo</title>
	<style type="text/css">
		div.container{
			padding:150px;
			mix-width:700px;
			margin:0 auto;
			align-items:center;
		}
		header h1{
			font-size:3em;
			text-align:center;
		}
		main{
			margin-top:50px;
			text-align:center;
		}
		main form input,label{
			font-size:1.5em;
		}
		main form label{
			margin-right:30px;
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
			<h1>New Dojo</h1>
		</header>
		<main>
			<form:form action="/addNewDojo" method="POST" modelAttribute="dojos">
				<p>
					<form:label path="name">Name</form:label>
					<form:errors path="name"/>
					<div>
						<form:input path="name" id="createButton"/>	
					</div>
				</p>
				<input type="submit" value="Create">
			</form:form>
		</main>
		<footer>
			<h2><a href="/ninjas/new">Create Ninja</a></h2>
		</footer>
	</div>
</body>
</html>