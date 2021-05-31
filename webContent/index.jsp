<%@page contentType="text/html; charset=iso-8859-1" pageEncoding="iso-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>previoWeb</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<form action="insert" method="post">
		<div class="container-md">
			<div class="mb-3">
				<label class="form-label">Estamento: </label>
				<select>
					<c:forEach var="n" items="${estamentos}">
						<option value="${n.getId()}" selected>${n.getDescripcion()}</option>
					</c:forEach>
				</select>
			</div>

			<div class="mb-3">
				<label class="form-label">Tipo de documento: </label> <select
					class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example">
					<option selected>Open this select menu</option>
					<option value="1">One</option>
					<option value="2">Two</option>
					<option value="3">Three</option>
				</select>
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Documento</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label" id="email">Nombre:</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default"
					pattern=".+@ufps.edu.co" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Email:</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Proceso:</label>
				<select class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example">
					<option selected>Open this select menu</option>
					<option value="1">One</option>
					<option value="2">Two</option>
					<option value="3">Three</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<br> <br>
		</div>
	</form>
	<%@include file="plantilla/footer.html"%>
</body>
</html>