<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="/success" method="post">
			<label for="username">Username:</label> 
			<input type="text" id="unm" name="unm" required><br>  
				
			<label for="Password">Password:</label> 
			<input type="password" id="pass" name="pass" required><br>

			<button type="submit">Check</button>
		</form>
	</center>
</body>