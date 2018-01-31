<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h2>Clientes</h2>

		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Apellidos</th>
					<th>Puntos</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cliente}" var="cliente">
					<tr>
						<td>${cliente.clientId}</td>
						<td>${cliente.apellidos}</td>
						<td>${cliente.puntos}</td>
					<tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div id="custom-search-input">
					<div class="input-group col-md-12">
						<input type="text" class="form-control input-lg"
							placeholder="Buscar" /> <span class="input-group-btn">
							<button class="btn btn-info btn-lg" type="button">
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>