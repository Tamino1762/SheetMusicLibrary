
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<jsp:include page="cssLinks.jsp"></jsp:include>
<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>
<div class="jumbotron">
    <h1 class="display-4">Sheet Music Library</h1>
    <img src="../../WEB-INF/resources/images/violinart.jpg" height="100" width="200" id="pic"> <!-- need to find the directory-->
    <p class="lead" id="jumboTron">Keep all of your sheet music organized with this simple online library!</p>
    <hr class="my-4">
    <p id="jumboTronRight">Ready to organize?</p>
    <a class="btn btn-primary btn-lg" href="login" role="button" id="jumboTronButton">Login</a>
</div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>
<!--bootstrap & JQuery js-->
<jsp:include page="jsLinks.jsp"></jsp:include>
</body>
</html>
