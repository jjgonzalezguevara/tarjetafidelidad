<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container" />
		</div>
	</section>
	<div class="container">
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


