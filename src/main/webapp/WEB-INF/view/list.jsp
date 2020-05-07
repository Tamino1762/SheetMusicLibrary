<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
<%@include file="cssLinks.jsp"%>
    <%--<link type="text/css" rel="stylesheet" href="${cp}WEB-INF/resources/css/styles.css">--%>
    <title>List</title>
</head>
<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>
    <h1>Sheet Music List</h1><br>
<security:authorize access="hasRole('USER')">
   <button class="add-button"
           onclick="window.location.href='${cp}/music/user/showAddMusicForm'; return false">
       Add Music
   </button>
</security:authorize>
    <div id="list">
        <div class="container">
            <div id="content">
                <form:form class="form-inline my-2 my-lg-0"  id="searchForm" method="GET" action="search">
                    <b>Search by title</b> &nbsp
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="searchTerm"><br>
                    <button class="btn btn-outline-success my-2 my-sm-0" input type="submit" value="Search">Search</button>
                </form:form><br>
                <table>
                    <tr>
                        <th>Title</th>
                        <th>Composer</th>
                    </tr>
                    <c:forEach var="tempMusic" items="${music}">
                        <c:url var="updateLink" value="/music/user/showAddMusicForm">
                            <c:param name="musicId" value="${tempMusic.musicId}"/>
                        </c:url>
                        <c:url var="deleteLink" value="/music/admin/delete">
                            <c:param name="id" value="${tempMusic.musicId}"/>
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
</body>
</html>
