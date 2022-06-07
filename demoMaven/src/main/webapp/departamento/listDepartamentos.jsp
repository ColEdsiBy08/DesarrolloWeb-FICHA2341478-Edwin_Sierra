<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Departamentos</title>
</head>
<body>
<div class="container">
<div>
	<nav>
		<a class="btn btn-outline-secondary" href="CiudadesServletController">Ciudades</a>
		<a class="btn btn-outline-secondary" href="EmpleadosServletController">Empleados</a>
	</nav>
</div>
<h1><c:out value="${titulo}"/></h1>


<form action="departamentos/crearDepartamento.jsp">
<input type="submit" value="Agregar" class="btn btn-primary"/>
</form> 

<div>
	<table class="table">
		<thead class="table-dark">
			<th>Id</th>
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Fecha creacion</th>
			<th>Fecha modificacion</th>
			<th></th>
			<th></th>
		</thead>
		<tbody>
			<c:forEach var="departamento" items="${Departamentos}">
			<tr>
				<td><c:out value="${departamento.idDepartamento}"/></td>
				<td><c:out value="${departamento.codigoDepartamento}"/></td>
				<td><c:out value="${departamento.nombreDepartamento}"/></td>
				<td><c:out value="${departamento.fechaCreacion}"/></td>
				<td><c:out value="${departamento.fechaModificacion}"/></td>
				<td><a class="btn btn-success" href="DepartamentoServletController?action=edit&id_Departamentos=<c:out value="${departamento.idDepartamento}"></c:out>">Editar</a></td>
				<td><input type="button" value="Eliminar" class="btn btn-danger"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</body>
</html>