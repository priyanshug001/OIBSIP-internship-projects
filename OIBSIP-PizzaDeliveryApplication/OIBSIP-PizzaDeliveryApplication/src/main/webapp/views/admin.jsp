<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String fname = (String) session.getAttribute("adminunm");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminPage</title>
</head>
<body>
	<center>
		<h1 style="color: black;">
			Welcome
			<%=fname%></h1>
		<div
			style="background-color: black; height: 30px; font-size: 18px; text-align: center;">
			<a href="/index" style="color: white;">Home</a> &nbsp;&nbsp;&nbsp; <a
				href="/adminregistrationdata" style="color: white;">AdminRegistrationData</a>
			&nbsp;&nbsp;&nbsp; <a href="/registrationdata" style="color: white;">UserRegistrationData</a>
			&nbsp;&nbsp;&nbsp; <a href="/adminlogindata" style="color: white;">AdminLoginData</a>
			&nbsp;&nbsp;&nbsp; <a href="/logindata" style="color: white;">UserLoginData</a>
		</div>
	</center>
</body>
</html>