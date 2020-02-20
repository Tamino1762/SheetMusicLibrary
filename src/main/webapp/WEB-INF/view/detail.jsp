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
<jsp:include page="cssLinks.jsp"></jsp:include>
<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
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
<jsp:include page="jsLinks.jsp"></jsp:include>
</body>
</html>
