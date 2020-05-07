<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <form:form class="form-inline my-2 my-lg-0"  id="searchForm" method="GET" action="search">
        <b>Search by title</b> &nbsp
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="searchTerm"><br>
        <button class="btn btn-outline-success my-2 my-sm-0" input type="submit" value="Search">Search</button>
    </form:form>
    </div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>
<jsp:include page="jsLinks.jsp"></jsp:include>

</body>
</html>
