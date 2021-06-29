<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Queries and Joins</title>
	<style type="text/css">
		div.row{
			display:flex;
		}
		div.question-area{
			padding:10px;
			border:1px solid black;
		}
		div.question-area h2{
			text-align:center;
		}
		div.question-area table tr, td{
			text-align:center;
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="question-area">
				<h2>Q1</h2>
				<table>
					<thead>
						<tr>
							<td>Country Name</td>
							<td>Language</td>
							<td>Language Percentage</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${firstQuestion}" var="country">
							<tr>
								<td><c:out value="${country[0]}"/></td>
								<td><c:out value="${country[1]}"/></td>
								<td><c:out value="${country[2]}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="question-area">
				<h2>Q2</h2>
				<table>
					<thead>
						<tr>
							<td>country</td>
							<td>Number of Cities</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${secondQuestion}" var="country">
							<tr>
								<td><c:out value="${country[0]}"></c:out>
								<td><c:out value="${country[1]}"></c:out>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="question-area">
				<h2>Q3</h2>
				<table>
					<thead>
						<tr>
							<td>City Name</td>
							<td>Population</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${thirdQuestion}" var="city">
							<tr>
								<td><c:out value="${city[0]}"/></td>
								<td><c:out value="${city[1]}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="question-area">
				<h2>Q4</h2>
				<table>
					<thead>
						<tr>
							<td>Country Name</td>
							<td>Language</td>
							<td>Percentage</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${fourthQuestion}" var="country">
							<tr>
								<td><c:out value="${country[0]}"/></td>
								<td><c:out value="${country[1]}"/></td>
								<td><c:out value="${country[2]}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="question-area">
				<h2>Q5</h2>
				<table>
					<thead>
						<tr>
							<td>Country Name</td>
							<td>Surface Area</td>
							<td>Population</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${fifthQuestion}" var="country">
							<tr>
								<td><c:out value="${country[0]}"/></td>
								<td><c:out value="${country[1]}"/></td>
								<td><c:out value="${country[2]}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="question-area">
				<h2>Q6</h2>
				<table>
					<thead>
						<tr>
							<td>Country Name</td>
							<td>Government Form</td>
							<td>Surface Area</td>
							<td>Life Expectancy</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${sixthQuestion}" var="country">
							<tr>
								<td><c:out value="${country[0]}"/></td>
								<td><c:out value="${country[1]}"/></td>
								<td><c:out value="${country[2]}"/></td>
								<td><c:out value="${country[3]}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="question-area">
				<h2>Q7</h2>
				<table>
					<thead>
						<tr>
							
							<td>City Name</td>
							<td>District</td>
							<td>Population</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${seventhQuestion}" var="country">
							<tr>
								
								<td><c:out value="${country[0]}"/></td>
								<td><c:out value="${country[1]}"/></td>
								<td><c:out value="${country[2]}"/></td>
				
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="question-area">
				<h2>Q8</h2>
				<table>
					<thead>
						<tr>
							
							<td>Region</td>
							<td>Number Of Countries</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${eighthQuestion}" var="country">
							<tr>
								
								<td><c:out value="${country[0]}"/></td>
								<td><c:out value="${country[1]}"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>