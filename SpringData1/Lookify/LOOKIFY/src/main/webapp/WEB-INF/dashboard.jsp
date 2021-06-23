<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lookify Dashboard</title>
	<style type="text/css">
		div.container{
			padding:20px 50px;
		}
		header{
			display:flex;
			justify-content:space-evenly;
		}
		div.headerFirstQuarter{
			display:flex;
			justify-content:space-arorund;
		}
		div.headerSecondQuarter{
			display:flex;
		}
		main{
			
			margin-top:100px;
			text_align:center;
			display:flex;
			flex-direction:column;
			vertical-align:center;
		}
		div.headerFirstQuarterAnchor{
			padding: 10px 50px 10px 10px;
			font-size:1.5em;
		}
		div.headerSecondQuarter form input{
			min-height:35px;
			text-align:center;
			font-size:1.5em;
		}
		table{
			text-align:center;
		}
		main thead td{
			padding-bottom:50px;
		}
		main thead td{
			font-size:2em;
		}
		main tbody td{
			font-size:1.5em;
		}
		#deleteButton{
			font-size:1em;
			border:none;
			background:none;
			color:blue;
		}
		#deleteButton:hover{
			color:red;
		}
	</style>
</head>
<body>
	<div class="container">
		<header>
			<div class="headerFirstQuarter">
				<div class="headerFirstQuarterAnchor">
					<a href="/songs/new">Add New</a>
				</div>
				<div class="headerFirstQuarterAnchor">
					<a href="/search/topTen">Top Songs</a>
				</div>
			</div>
			<div class="headerSecondQuarter">
				<form:form action="/search" method="POST">
					<input name="artist">
					<input type="submit" value="Search Artist" id="submit">
				</form:form>
			</div>
		</header>
		<main>
			<table>
				<thead>
					<tr>
						<td>Name</td>
						<td>Rating</td>
						<td>actions</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${playLists}" var="playList">
						<tr>
							<td> <a href="/details/${playList.id}">${playList.title}</a> </td>
							<td>${playList.rating}</td>
							<td>
								<form:form action="/delete/${playList.id}/${playList.artist}" method="POST">
									<input type="hidden" name="_method" value="delete">
									<input type="submit" value="delte" id="deleteButton">
								</form:form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</main>
	</div>
</body>
</html>