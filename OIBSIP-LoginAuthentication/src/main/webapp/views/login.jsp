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
		<form action="/login" method="post">
			<label for="username">Create Username:</label> 
			<input type="text" id="unm" name="unm" required><br>  
				
			<label for="Password">Create Password:</label> 
			<input type="password" id="pass" name="pass" required><br>

			<button type="submit">Save User</button>
		</form>
		<a href="welcome"> Login Check</a>
	</center>
</body>
</html>