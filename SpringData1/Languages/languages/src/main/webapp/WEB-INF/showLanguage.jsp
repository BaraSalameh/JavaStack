<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Language</title>
</head>
<body>
	<main>
		<div>
			<c:out value="${language.name }"/>
		</div>
		<div>
			<c:out value="${language.creator }"/>
		</div>
		<div>
			<c:out value="${language.version }"/>
		</div>
		<div>
			<form:form action="/editLanguage" method="POST" methodAttribute="language">
				<form:input type="hidden" path="_method" value="${language.id }"/>
				<input type="submit" value="Edit"> 
			</form:form>
		</div>
		<div>
			<form:form action="/delete/${language.id }" method="GET">
				<input type="submit" value="Delete"> 
			</form:form>
		</div>
		
	</main>
</body>
</html>