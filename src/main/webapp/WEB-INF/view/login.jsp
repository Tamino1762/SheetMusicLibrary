<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="cssLinks.jsp"></jsp:include>
    <title>Login</title>
</head>
<body>
<div class="headFoot"></div>
<jsp:include page="navbar.jsp"></jsp:include>
<div id="container">
    <div id="content">
        <h3>Login</h3>
        <form:form action="${cp}/authenticate" method="POST">
            <table>
             <%--   <!-- Only show this message if the user has been logged out -->
                <c:if test="${param.logout != null}">
                <tr>
                    <td></td>
                    <td>You have been logged out</td>
                </tr>--%>
                <tr>
                    <td><label>Username</label></td>
                    <td><input type="text" name="username" <%--value="user"--%>></td>
                </tr>
                <tr>
                    <td><label>Password</label></td>
                    <td><input type="text" name="password" <%--value="p"--%>></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"></td>
                </tr>
                <c:if test="${param.error != null}">
                    <tr>
                        <td></td>
                        <td class="error">Invalid Login</td>
                    </tr>
                </c:if>
            </table>
        </form:form>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
</div>

<jsp:include page="jsLinks.jsp"></jsp:include>
</body>
</html>
