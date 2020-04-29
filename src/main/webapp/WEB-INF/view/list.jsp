<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
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
            <div id="content">
                <table>
                    <tr>
                        <th>Title</th>
                        <th>Composer</th>
                    </tr>
                    <c:forEach var="tempMusic" items="${music}">
                        <c:url var="updateLink" value="/music/showUpdateMusicForm">
                            <c:param name="musicId" value="${tempMusic.id}"/>
                        </c:url>
                        <c:url var="deleteLink" value="/music/delete">
                            <c:param name="id" value="${tempMusic.id}"/>
                        </c:url>

                        <tr>
                        <td>${tempMusic.title}</td>
                        <td>${tempMusic.composer}</td>
                        <td>
                            <a href="${updateLink}"><i class="fas fa-pencil-alt"></i></a>
                        </td>
                        <td>
                            <a href="${deleteLink}" onclick="if (!confirm('Are you sure?')) return false">
                                <i class="far fa-trash-alt"></i>
                                </a>
                        </td>

                        </tr>
                    </c:forEach>
                </table>
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
