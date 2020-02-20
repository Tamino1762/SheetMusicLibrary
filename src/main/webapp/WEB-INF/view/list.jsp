<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 1/22/2020
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<jsp:include page="cssLinks.jsp"></jsp:include>
    <title>List</title>
</head>
<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>
    <h1>Sheet Music List</h1><br>
    <!-- Large modal -->
    <div id="modal">
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bd-example-modal-lg">Add Music</button>

    <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <h3>Add Music</h3>
               <!--content here-->
                <input class="form-control form-control-sm" type="text" placeholder="Title"><br>
                <input class="form-control form-control-sm" type="text" placeholder="Composer"><br>
                <input class="form-control form-control-sm" type="text" placeholder="Publisher"><br>
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Instrument</label>
                    <select class="form-control" id="exampleFormControlSelect1" name="instrument">
                        <option>Guitar</option>
                        <option>Piano</option>
                        <option>Violin</option>
                        <option>Viola</option>
                        <option>Other</option>
                    </select>
                </div><br>
                <div class="form-group">
                    <label for="exampleFormControlSelect1">Format</label>
                    <select class="form-control" id="exampleFormControlSelect2" name="format">
                        <option>Book</option>
                        <option>Electronic</option>
                        <option>Magazine</option>
                        <option>Single Sheet</option>
                        <option>Other</option>
                    </select>
                </div><br>
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                        <div class="col">
                            <button type="reset" id="reset" class="btn btn-primary">Reset</button>
                        </div>
                    </div>
            </div>
        </div>
    </div>
    </div>
    </div><%--end modal--%>
    <div id="list">
        <div class="container">
        <div class="row">
            <div class="col">
                <p><i>24 Caprices</i> by: N. Paganini</p> </div>
            <div class="col">
                <button type="button" class="btn btn-link"><i class="fas fa-pencil-alt"></i></button>
                <button type="button" class="btn btn-link"> <i class="far fa-trash-alt"></i></button>
            </div>

        </div>
            <div class="row">
                <div class="col">
                    <p><i>Linus and Lucy</i> by: Vince Guaraldi</p> </div>
                <div class="col">
                    <button type="button" class="btn btn-link"><i class="fas fa-pencil-alt"></i></button>
                    <button type="button" class="btn btn-link"> <i class="far fa-trash-alt"></i></button>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <p><i>Spellbound</i> by: Lacuna Coil</p> </div>
                <div class="col">
                    <button type="button" class="btn btn-link"><i class="fas fa-pencil-alt"></i></button>
                    <button type="button" class="btn btn-link"> <i class="far fa-trash-alt"></i></button>
                </div>
            </div>
        </div>
    </div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>


<jsp:include page="jsLinks.jsp"></jsp:include>
<script>$('#myModal').on('shown.bs.modal', function () {
    $('#myInput').trigger('focus')
})</script>
</body>
</html>
