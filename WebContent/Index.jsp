<%@ include file = "header.jsp" %>
<title>Index</title>
</head>
<body>
	<div class="container">
		<form action="LoginServlet" method="post" name="Submit">
			<label for="username">Username:</label> <input class="w3-input w3-border" type="text" name="username" />

		<label for="pass">Password (8 characters minimum):</label> 
		<input class="w3-input w3-border" type="password"  name="password"	 required />
	<input class="w3-button" type="submit"	value="Sign in" />
	</form>
	</div>
</body>
</html>