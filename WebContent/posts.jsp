<%@ include file="header.jsp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title>Posts</title>
</head>
<body>
	
	<div class="jumbotron jumbotron-fluid">
	<div class="container">
		<h2>Most recents posts</h2>
		<form action="LoginServlet" method="get">
			<input type="submit" class="btn-default" value="Return to home" />
		</form>
		</div>
		</div>
		<div class="container">
		<c:forEach items="${ sessionScope.posts }" var="post"
			varStatus="status">

			<ul class="list-group">
				<li class="list-group-item">
					<h4 class="list-group-item-heading">
						<c:out value="${ post.titre }" />
					</h4>
					<p class="list-group-item-text">
						<c:out value="${ post.contenu }" />
					</p>
					<p class="list-group-item-text">
						Posté par
						<c:out value="${ post.utilisateur.username }" />
						le :
						<fmt:formatDate type="both" value="${post.date.time}" />
					</p>
				</li>
			</ul>
		</c:forEach>
	</div>
</body>
</html>