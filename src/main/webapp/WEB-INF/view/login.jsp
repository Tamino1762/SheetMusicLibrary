<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="cssLinks.jsp"></jsp:include>
    <title>Login</title>
</head>
<body>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>
<div id="container">
    <div id="content">
        <h3>Login</h3>
        <form:form action="${cp}/authenticate" method="post">
            <table>
                <tr>
                    <td><label>Username</label></td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td><label>Password</label></td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"></td>
                </tr>
                <c:if test="${param.error !=null}">
                    <tr>
                        <td></td>
                        <td class="error">Invalid Login</td>
                    </tr>
                </c:if>
            </table>
        </form:form>
    </div>
</div>

<jsp:include page="jsLinks.jsp"></jsp:include>
</body>
</html>
