<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="plantilla/head.html"%>
<body>
<form action="insert" method="post">
		<div class="container-md">
			<div class="mb-3">
				<label class="form-label">Nombre: </label> <input type="text"
					class="form-control" aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Lema</label> <input
					type="text" class="form-control" aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Descripcion</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label" id="email">Email
					address</label> 
					<input type="text" class="form-control"	aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default"pattern=".+@ufps.edu.co" required>
					<c:if test="${mensaje != null}">
					<div id="emailHelp" class="form-text text-danger"><c:out value="${mensaje}"/></div>
					</c:if>
					
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Propietario</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Facebook</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Web</label><input
					type="text" class="form-control" aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>

			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Imagen</label>
				<input type="text" class="form-control"
					aria-label="Sizing example input"
					aria-describedby="inputGroup-sizing-default" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
			<br> <br>
		</div>
	</form>
	<%@include file="plantilla/footer.html"%>
</body>
</html>