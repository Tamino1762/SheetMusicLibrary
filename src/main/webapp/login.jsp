
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<jsp:include page="cssLinks.jsp"></jsp:include>
<body>
<%--Navbar--%>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<div class="headFoot"><jsp:include page="header.jsp"></jsp:include></div><br>
<header>Login</header>
<div class="container">
<form>
    <div class="col-auto">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" name="password">
    </div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" id="reset" class="btn btn-primary"> Reset </button>

</form>
</div><br>
<div class="headFoot"><jsp:include page="footer.jsp"></jsp:include></div>
<jsp:include page="jsLinks.jsp"></jsp:include>
</body>
</html>
