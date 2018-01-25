<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Webdisenia .:. Ejemplo Bootstrap</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script>
	$(document).ready(function() {

		$("#containero").hide();

		$("#acceder").on('click', function() {
			$("#containero").show();
		});
	});
</script>

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Sitio Web</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Inicio</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">P&aacute;gina 1 <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">P&aacute;gina 1-1</a></li>
							<li><a href="#">P&aacute;gina 1-2</a></li>
							<li><a href="#">P&aacute;gina 1-3</a></li>
						</ul></li>
					<li><a href="#">P&aacute;gina 2</a></li>
					<li><a href="#">P&aacute;gina 3</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Registrarse</a></li>
					<li><a id="acceder"><span
							class="glyphicon glyphicon-log-in"></span> Acceder</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container" id="containero">
		<div class="row">
			<div class="col-md-offset-0 col-md-2">
				<div class="form-login">
					<form:form method="POST" modelAttribute="usuario">
						<h4>Acceso a usuarios</h4>
						<form:input type="text" id="userlogin" path="userlogin"
							class="form-control input-sm chat-input" placeholder="usuario" />
						</br>
						<form:input type="text" id="password" path="password"
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
	</div>
</body>
</html>