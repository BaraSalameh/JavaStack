<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Languages</title>
</head>
<body>
	<main>
		<table>
			<thead>
				<tr>
					<td>Name</td>
					<td>Creator</td>
					<td>Version</td>
					<td>action</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${languages }" var="language">
					<tr>
						<td><a href="/languages/${language.id }">${language.name}</a></td>
						<td><c:out value="${language.creator}"/></td>
						<td><c:out value="${language.version}"/></td>
						<td><a href="/delete/${language.id }">Delete</a><a href="/edit/${language.id }">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
	<footer>
		<form:form action="/addLanguage" method="POST" modelAttribute="language" > 
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name"/>
				<form:input path="name"/>
			</p>
			<p>
				<form:label path="creator">Creator</form:label>
				<form:errors path="creator"/>
				<form:input path="creator"/>
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version" />
				<form:input type="number" path="version"/>
			</p>
			<p>
				<input type="submit" value="Add"/>
			</p> 
		</form:form>
	</footer>
</body>
</html>