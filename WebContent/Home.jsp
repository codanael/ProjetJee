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
		<form action="PostServlet" method="post" name="Submit">
			<label for="titre">Titre:</label> <input class="w3-input w3-border"
				type="text" name="titre" /> <input class="w3-input w3-border"
				type="text" name="contenu" required /> <input
				class="w3-button w3-black w3-right w3-section" type="submit"
				value="Post" />
		</form>
	</div>
	<p>Hi <c:out value="${sessionScope.user.username}"></c:out> </p>
</body>
</html>