
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sheet Music List</title>
    <%@include file="cssLinks.jsp"%>
</head>
<body>
<div id="container">
    <div id="content">
        <h3> Ope! Sorry! An error occurred!</h3>
        <p>${errorMessage}</p>
    </div>
    <div style="clear: both;">
        <p>
            <a href="${pageContext.request.contextPath}/music/list">Back To List</a>
        </p>
    </div>
</div>
</body>
</html>
