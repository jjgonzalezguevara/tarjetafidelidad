<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
		<ul class="nav navbar-nav">
      		<li class="active"><a href="#">Home</a></li>
      		<li><a href="<spring:url value="/ofertas/items" />">Ofertas</a></li>
      		<li><a href="#">Reservas</a></li>
    	</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="<spring:url value="#" />"><span class="glyphicon glyphicon-user"></span>${cliente.apellidos}</a></li>
		</ul>
	</div>
	</nav>
	<section class="container">
		<div class="row">
			<c:forEach items="${items}" var="item">
				<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
						<div class="caption">
	 						<h3>${item.name}</h3> 
							<p>${item.itemId}</p>
							<p>${item.description}</p>
 							<p><a href="#" class="btn btn-primary"> <span class="glyphicon-info-sign glyphicon" /></span> Detalle</a></p> 
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
