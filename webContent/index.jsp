<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="plantilla/head.html"%>
<body>
	<form action="insert" method="post">
		<div class="container-md">
			<div class="mb-3">
				<label class="form-label">Estamento: </label> <select
					class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example">
					<option selected>Open this select menu</option>
					<option value="1">One</option>
					<option value="2">Two</option>
					<option value="3">Three</option>
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