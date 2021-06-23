<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lookify</title>
	<style type="text/css">
		div.container{
			width:700px
			margin:auto auto;
			display:flex;
			flex-direction:column;
			align-items:center;
		}
		header{
			text-align:center;
			height:250px;
		}
		header h1{
			font-size:5em;
		}
		main{
			text-align:center;
		}
		main a{
			font-size:2em;
		}
		
	</style>
</head>
<body>
	<div class="container">
		<header>
			<h1>Welcome to Lookify!</h1>
		</header>
		<main>
			<a href="/dashboard">Start Looking!</a>
		</main>
	</div>
</body>
</html>