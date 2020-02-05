
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List 2</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include><br>

<%--<p><%= request.getAttribute("myMusic") %></p>--%>
<table>
    <tr>
        <th>Title</th>
        <th>Composer</th>
        <th>Instrument</th>
        <th>Difficulty</th>
    </tr>

    <c:forEach var="musicStuff" items="${myMusic}">
        <tr>
            <td>${musicStuff.title}</td>
            <td>${musicStuff.composer}</td>
            <td>${musicStuff.type}</td>
            <td>${musicStuff.difficulty}</td>
        </tr>
    </c:forEach>
</table>





<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
