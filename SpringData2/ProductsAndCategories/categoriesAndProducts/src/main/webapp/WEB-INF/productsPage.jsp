<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Product Page</title>
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
			display:flex;
			justify-content:space-evenly;
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1><c:out value="${product.name}"/></h1>
		</header>
		<main>
			<div>
				<div>
					<h2>Categories</h2>
				</div>
				<div>
					<c:forEach items="${product.categories}" var="categories">
						<ul>
							<li>${categories.name}</li>
						</ul>
					</c:forEach>
				</div>
			</div>
			<div>
				<form:form action="/addCategoryToProduct" method="POST" modelAttribute="products">
					<p>
						<form:label path="categories">Categories</form:label>
						<form:errors path="categories"/>
						<form:select path="categories">
							<c:forEach items="${categories}" var="category">
								<form:option value="${category.id}"><c:out value="${category.name}"/></form:option>
							</c:forEach>
						</form:select>
					</p>
				<input type="submit" value="Add">
			</form:form>
			</div>
		</main>
	</div>
</body>
</html>