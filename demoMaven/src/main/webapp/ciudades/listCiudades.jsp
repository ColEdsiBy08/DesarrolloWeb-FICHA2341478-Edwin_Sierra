<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empleados</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
<div>
	<nav>
		<a class="btn btn-outline-secondary" href="DepartamentoServletController">Departamento</a>
		<a class="btn btn-outline-secondary" href="EmpleadosServletController">Empleados</a>
	</nav>
</div>
<h1><c:out value="${titulo}"/></h1>


<form action="Ciudades/crearCiudad.jsp">
<input type="submit" value="Agregar" class="btn btn-primary"/>
</form> 

<div>
	<table class="table">
		<thead class="table-dark">
			<th>Id Ciudad</th>
			<th>Id Departamento</th>
			<th>Nombre</th>
			<th>Codigo</th>
			<th></th>
			<th></th>
		</thead>
		<tbody>
			<c:forEach var="Ciudades" items="${Ciudades}">
			<tr>
				<td><c:out value="${Ciudades.idCiudad}"/></td>
				<td><c:out value="${Ciudades.idDepartamento}"/></td>
				<td><c:out value="${Ciudades.nombreCiudad}"/></td>
				<td><c:out value="${Ciudades.codigoCiudad}"/></td>
				<td><a class="btn btn-success" href="CiudadesServletController?action=edit&idCiudad=<c:out value="${ciudad.idCiudad}"></c:out>"> Editar </a></td>
				<td><input type="button" value="Eliminar" class="btn btn-danger"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</body>
</html>