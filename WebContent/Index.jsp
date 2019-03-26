<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Hello</title>
</head>
<body>
	<div>
		<form action="LoginServlet" method="post" name="Submit">
			<label for="username">Username:</label> <input class="w3-input w3-border" type="text" name="username" />

		<label for="pass">Password (8 characters minimum):</label> 
		<input class="w3-input w3-border" type="password"  name="password"	 required />
	<input class="w3-button w3-black w3-right w3-section" type="submit"	value="Sign in" />
	</form>
	</div>
</body>
</html>