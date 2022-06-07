<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Editar Departamento</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${titulo}"></c:out></h1>
		<div>
		  <c:set var="dept" value="${departamento}" />
			<form action="DepartamentoServletController?action=actualizar" method="post">
				<div class="form-group">
					<label>Id</label>
					<input type="text" class="form-control" name="id" readonly="readonly" value=<c:out value="${dept.idDepartamento}" /> /  />
				</div>
				<div>
					<label>Codigo</label>
					<input type="text" class="form-control" name="codigo" value=<c:out value="${dept.codigoDepartamento" /> / />
				</div>
				<div>
					<label>Nombre</label>
					<input type="text" class="form-control" name="nombre" value=<c:out value="${dept.nombreDepartamento}" /> / />
				</div>
				<div>
					<label>Fecha de creación</label>
					<input type="date" class="form-control" name="fecha_crea" value=<c:out value="${dept.fechaCreacion}" /> / />
				</div>
				<div>
					<input type="submit" value="Guardar" class="btn btn-primary" /> <a class="btn btn-danger"  href="DepartamentoServletController?action=regresar">Regresar</a>
				</div>
			</form>
		</div>
	</div>

</body>
</html>