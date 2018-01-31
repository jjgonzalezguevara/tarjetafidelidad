<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header"><a class="navbar-brand" href="#">Tarjeta de fidelización</a></div>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="<spring:url value="/registro" />"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
			<li><a href="<spring:url value="/login" />"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
		</ul>
	</div>
	</nav>
		<div class="container">
		<div class="row">
			<div class="col-md-offset-0 col-md-2">
				<div class="form-login">
					<form:form action="dologin" method="POST" modelAttribute="usuario">
						<h4>Acceso a usuarios</h4>
						<form:input type="text" id="userlogin" path="userlogin"
							class="form-control input-sm chat-input" placeholder="usuario" />
						</br>
						<form:input type="password" id="password" path="password"
							class="form-control input-sm chat-input" placeholder="password" />
						</br>
						<div class="wrapper">
							<span class="group-btn"> <input type="submit"
								id="btnLogin" class="btn btn-primary" value="Login" />
							</span>
						</div>
					</form:form>
				</div>

			</div>
		</div>

		<div class="row">
			<span style="color: red;">${message}</span>

		</div>

	</div>
</body>
</html>


