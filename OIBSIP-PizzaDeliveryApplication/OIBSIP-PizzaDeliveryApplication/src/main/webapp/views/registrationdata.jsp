<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
List<String> order = (List<String>) session.getAttribute("dataall");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
		<h1>Registration Data</h1>
		<h4>${dataall}</h4>
	</div>
</body>
</html>