<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="cp" value="${pageContext.request.contextPath}"/>
<nav class="navbar navbar-dark bg-dark">
    <!-- Navbar content -->
    <a class="navbar-brand" href="#">Sheet Music Library</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${cp}/music/list">List</a>
            </li>
        </ul>
    </div>
    <form class="form-inline">
        <div style="color: white">
        <c:choose>
            <c:when
                    test="${pageContext.request.userPrincipal != mull}">
                Hello &nbsp;<strong>
                    ${pageContext.request.userPrincipal.name}
            </strong>
                &nbsp;
        </div>
                <a class="btn btn-outline-success my-2 my-sm-0" href="${pageContext.request.contextPath}/showLoginForm" role="button">Logout</a>
            </c:when>
            <c:otherwise>
                <a class="btn btn-outline-success my-2 my-sm-0" href="${pageContext.request.contextPath}/showLoginForm" role="button">Login</a>
            </c:otherwise>
        </c:choose>
    </form>
</nav>
