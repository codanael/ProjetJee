<%@ include file="header.jsp"%>
<title>Home</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
	<div class="container">
		<h3>Hi <c:out value="${sessionScope.user.username}"></c:out></h3>
		</div>
		</div>
	<div class="container">
		<form action="PostServlet" method="post" name="Submit">
			<label for="titre">Titre:</label> 
			<input class="w3-input w3-border"	type="text" name="titre" /> 
			<label for="contenu">Contenu:</label>
			<input class="w3-input w3-border" type="text" name="contenu" required /> 
			<input class="w3-button " type="submit" value="Post" />
		</form>
	</div>
	<div class="container">
		<form action="ShowPostsServlet" method="get">
			<input type="submit" class="btn-default" value="See posts" />
		</form>
	</div>
	<div class="container">
		<form action="LogoutServlet" method="get">
			<input type="submit" class="btn-default" value="Logout" />
		</form>
	</div>
</body>
</html>