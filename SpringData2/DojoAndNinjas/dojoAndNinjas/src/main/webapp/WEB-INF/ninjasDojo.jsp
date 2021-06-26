<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dojo Page</title>
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
		table{
			margin:auto;
		}
		table tr#headerTr td{
			font-size:2em;
			padding:0 50px 20px 50px;
			
		}
		table tr#bodyTr{
			font-size:1.5em;
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
		</header>
		<main>
			<table>
				<thead>
					<tr id="headerTr">
						<td>First Name</td><td>Last Name</td><td>Age</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${dojo.ninjas}" var="ninja">
						<tr id="bodyTr">
							<td>${ninja.firstName}</td><td>${ninja.lastName}</td><td>${ninja.age}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</main>
	</div>
</body>
</html>