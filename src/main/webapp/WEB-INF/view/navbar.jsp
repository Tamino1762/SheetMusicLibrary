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
                <a class="nav-link" href="music/list">List</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="detail">Detail</a>
            </li>
        </ul>
    </div>
    <form class="form-inline">
        <a class="btn btn-outline-success my-2 my-sm-0" href="${pageContext.request.contextPath}/showLoginForm" role="button">Login</a>
    </form>
</nav>
