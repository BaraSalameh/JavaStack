<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
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
		#dojo{
			font-size:1.5em;
			padding: 5px 10px;	
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1>New Ninja</h1>
		</header>
		<main>
			<form:form action="/addNewNinja" method="POST" modelAttribute="ninjas">
				<p>
					<form:label path="dojo">Dojo</form:label>
					<form:errors path="dojo"/>
					<form:select path="dojo">
						<c:forEach items="${dojos}" var="dojo">
							<form:option id="dojo" value="${dojo.id}"><c:out value="${dojo.name}"/></form:option>
						</c:forEach>
					</form:select>
				</p>
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
				<p>
					<form:label path="age">Age</form:label>
					<form:errors path="age"/>
					<form:input type="number" min="12" max="65" value="23" path="age"/>
				</p>
				<input type="submit" value="Create">
			</form:form>
		</main>
		<footer>
			<h2><a href="/dojos/new">Create Dojo</a></h2>
		</footer>
	</div>
</body>
</html>