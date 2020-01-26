<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 1/22/2020
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<!--fontawesome-->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
<!--bootstrap-->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<%--Local--%>
<link rel="stylesheet" href="css/styles.css">
<body>
<%--Navbar--%>
<nav class="navbar navbar-dark bg-dark">
    <!-- Navbar content -->
    <a class="navbar-brand" href="#">Sheet Music Library</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="list.jsp">List</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="detail.jsp">Detail</a>
            </li>
        </ul>
    </div>
    <form class="form-inline">
        <a class="btn btn-outline-success my-2 my-sm-0" href="login.jsp" role="button">Login</a>
    </form>
</nav>
<div class="jumbotron">
    <h1 class="display-4">Sheet Music Library</h1>
    <img src="images/violinart.jpg">
    <p class="lead" id="jumboTron">Keep all of your sheet music organized with this simple online library!</p>
    <hr class="my-4">
    <p id="jumboTronRight">Ready to organize?</p>
    <a class="btn btn-primary btn-lg" href="login.jsp" role="button" id="jumboTronButton">Login</a>
</div>
<!--bootstrap & JQuery js-->
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<%--local--%>
<script src="scripts/scripts.js"></script>
</body>
</html>
