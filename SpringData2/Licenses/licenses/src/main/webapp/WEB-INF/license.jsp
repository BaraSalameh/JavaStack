<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New License</title>
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
			<h1>New License</h1>
		</header>
		<main>
			<form:form action="/addNewLicense" method="POST" modelAttribute="licenses">
				<p>
					<form:label path="person">Person</form:label>
					<form:errors path="person"/>
					<form:select path="person">
						<c:forEach items="${persons}" var="person">
							<form:option value="${person}">
								${person.firstName} ${person.lastName }
							</form:option>
						</c:forEach>
					</form:select>
				</p>
				<p>
					<form:label path="state">State</form:label>
					<form:errors path="state"/>
					<form:input path="state"/>
				</p>
				<p>
					<form:label path="expirationDate">Expiration Date</form:label>
					<form:errors path="expirationDate"/>
					<form:input type="date" path="expirationDate"/>
				</p>
				<input type="submit" value="Create" id="createButton">
			</form:form>
		</main>
		<footer>
			<h2><a href="/persons/new">Create Person</a></h2>
		</footer>
	</div>
</body>
</html>