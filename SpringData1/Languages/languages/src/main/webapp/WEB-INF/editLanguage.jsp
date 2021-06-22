<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Update</title>
</head>
<body>
	<main>
		<form:form action="/editLanguage" method="POST" modelAttribute="language" > 
			<form:input type="hidden" path="id" value="${language.id }"/>
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name"/>
				<form:input path="name" value="${language.name }"/>
			</p>
			<p>
				<form:label path="creator">Creator</form:label>
				<form:errors path="creator"/>
				<form:input path="creator" value="${language.creator }"/>
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version" />
				<form:input type="number" path="version" value="${language.version }"/>
			</p>
			<p>
				<input type="submit" value="Update"/>
			</p> 
		</form:form>
	</main>
</body>
</html>