<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String uname = (String) session.getAttribute("unm");
if(uname==null || uname.isBlank() || uname==""){
	response.sendRedirect("login");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lightblue;">
	<h1 Style="color: black; text-align:center">Welcome <%= uname%></h1>
	<h2 Style="color: black; text-align:center">Login Sucessfully...</h2>
</body>
</html>