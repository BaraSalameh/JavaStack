<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Product</title>
	<style type="text/css">
		div.container{
			min-width:700px;
			margin:0 auto;
			text-align:center;
		}
		header h1{
			text-align:center;
			font-size:3em;
		}
		main{
			margin-top:50px;
			text-align:center;
		}
		footer{
			margin-top:100px;
			text-align:center;
		}
		footer a{
			font-size:1em;
		}
		footer a:hover{
			font-size:2em;
			color:green;
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1>New Category</h1>
		</header>
		<main>
			<form:form action="/addNewCategory" method="POST" modelAttribute="categories">
				<p>
					<form:label path="name">Name</form:label>
					<form:errors path="name"/>
					<form:input path="name"/>
				</p>
				<input type="submit" value="Create">
			</form:form>
		</main>
		<footer>
			<a href="/products/new">Create Product</a>
		</footer>
	</div>
</body>
</html>