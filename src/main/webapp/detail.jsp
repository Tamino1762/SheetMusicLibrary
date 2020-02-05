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
    <title>Detail</title>
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
            <li class="nav-item">
                <a class="nav-link" href="index.jsp">Home </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="list.jsp">List</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="detail.jsp">Detail <span class="sr-only">(current)</span></a>
            </li>
        </ul>
    </div>
    <form class="form-inline">
        <a class="btn btn-outline-success my-2 my-sm-0" href="login.jsp" role="button">Login</a>
    </form>
</nav>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>
    <header>Detail</header><br>
    <div id="list">
        <div class="container">
            <div class="row">
                <div class="col">
                    <h6>Title and Composer</h6>
                    <p><i>24 Caprices</i> by: N. Paganini</p> </div>
                <div class="col">
                    <h6>Instrument</h6>
                    <p>Violin</p>
                </div>
                <div class="col">
                    <h6>Format</h6>
                    <p>Book</p>
                </div>
                <div class="col">
                    <button type="button" class="btn btn-link"><i class="fas fa-pencil-alt"></i></button>
                    <button type="button" class="btn btn-link"> <i class="far fa-trash-alt"></i></button>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h6>Title and Composer</h6>
                    <p><i>Linus and Lucy</i> by: Vince Guaraldi</p> </div>
                <div class="col">
                    <h6>Instrument</h6>
                    <p>Piano</p>
                </div>
                <div class="col">
                    <h6>Format</h6>
                    <p>Sheet</p>
                </div>
                <div class="col">
                    <button type="button" class="btn btn-link"><i class="fas fa-pencil-alt"></i></button>
                    <button type="button" class="btn btn-link"> <i class="far fa-trash-alt"></i></button>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <h6>Title and Composer</h6>
                    <p><i>Spellbound</i> by: Lacuna Coil</p> </div>
                <div class="col">
                    <h6>Instrument</h6>
                    <p>Guitar</p>
                </div>
                <div class="col">
                    <h6>Format</h6>
                    <p>Electronic</p>
                </div>
                <div class="col">
                    <button type="button" class="btn btn-link"><i class="fas fa-pencil-alt"></i></button>
                    <button type="button" class="btn btn-link"> <i class="far fa-trash-alt"></i></button>
                </div>

            </div>
        </div>
    </div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>
    <!--bootstrap & JQuery js-->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <%--local--%>
    <script src="scripts/scripts.js"></script>
</body>
</html>
