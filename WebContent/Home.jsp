<%@ include file="header.jsp"%>
<title>Home</title>
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
	<p>
		Hi<c:out value="${sessionScope.user.username}"></c:out>
	</p>
	<form action="ShowPostsServlet" method="get">
		<input type="submit" class="btn-default" value="See posts"/> 
	</form>
</body>
</html>