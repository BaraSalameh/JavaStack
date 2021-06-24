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
			margin:0 auto;
			max-width: 800px;
			display:flex;
			flex-direction:column;
			align-items:center;
		}
		main{
			align-items:left;
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1><c:out value="${person.firstName} ${person.lastName}"/></h1>
		</header>
		<main>
			<p>
				License Number	<c:out value="${person.license.number}" />
			</p>
			<p>
				State	<c:out value="${person.license.state}"/>
			</p>
			<p>
				Expiration Date	<c:out value="${person.license.expirationDate}"></c:out>
			</p>
		</main>
	</div>
</body>
</html>