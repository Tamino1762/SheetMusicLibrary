<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <jsp:include page="cssLinks.jsp"></jsp:include>
    <%--<link type="text/css" rel="stylesheet" href="${cp}WEB-INF/resources/css/styles.css">--%>
    <title>List</title>
</head>
<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>
<div id="header">
<h1>Add Music</h1>
    <c:choose>
        <c:when
            test="${pageContext.request.userPrincipal != mull}">
            Hello <strong>
                ${pageContext.request.userPrincipal.name}
        </strong>
            &nbsp; | &nbsp;
            <a href="${cp}/logout">Logout</a>
        </c:when>
        <c:otherwise>
            <a href="${cp/showLoginForm}">Login</a>
        </c:otherwise>
    </c:choose>
</div>

    <div class="container">
        <div id="content">
            <form:form action="/music/save" modelAttribute="aMusic" enctype="multipart/form-data"
                method="post">
                <form:hidden path="musicId" value="${aMusic.musicId}"/>

                <table>
                    <tr>
                        <td><label>Title</label></td>
                        <td><form:input path="title"/>
                        <form:errors path="title" cssClass="error"/></td>
                    </tr>
                    <tr>
                        <td><label>Composer</label></td>
                        <td><form:input path="composer"/>
                            <form:errors path="composer" cssClass="error"/> </td>
                    </tr>
                    <tr>
                        <td><label>Instrument</label></td>
                        <td>
                            <form:select path="detail" items="${instrument}" itemLabel="instrument" itemValue="id"
                                cssClass="select-css">

                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Publisher</label></td>
                        <td>
                            <form:select path="detail" items="${publisher}" itemLabel="publisher" itemValue="id"
                                cssClass="select-css">
                            </form:select>
                        </td>
                    </tr>
                    <tr>
                        <td><label>Format</label></td>
                        <form:select path="detail" items="${format}" itemLabel="format" itemValue="id"
                            cssClass="selet-css">
                        </form:select>
                    </tr>
                    <td></td>
                    <td><input type="submit" value="Save" class="save"></td>
                </table>

            </form:form>

        </div>
</div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>


<jsp:include page="jsLinks.jsp"></jsp:include>
</body>
</html>

