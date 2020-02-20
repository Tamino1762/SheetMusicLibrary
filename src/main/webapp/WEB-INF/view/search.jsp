<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 1/29/2020
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<jsp:include page="cssLinks.jsp"></jsp:include>

<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>

    <header>Search Sheet Music</header><br><br>

    <div class="container" id="search">
    <form class="form-inline my-2 my-lg-0"  id="searchForm" method="get" action="search2">
        <b>Search by title</b> &nbsp
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="title"><br>
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    </div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>
<jsp:include page="jsLinks.jsp"></jsp:include>

</body>
</html>
