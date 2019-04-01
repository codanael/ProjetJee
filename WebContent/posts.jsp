<%@ include file = "header.jsp" %>
<title>Posts</title>
</head>
<body>
<c:forEach items="${ sessionScope.posts }" var="post" varStatus="status">
    <p>N°<c:out value="${ status.count }" /> : <c:out value="${ post.titre }" /> posté à : <c:out value="${ post.date }" /></p>
    <p>°<c:out value="${ post.contenu }" /></p>
</c:forEach>
</body>
</html>