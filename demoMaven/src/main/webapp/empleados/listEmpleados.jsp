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
		<a class="btn btn-outline-secondary" href="CiudadesServletController">Ciudades</a>
		<a class="btn btn-outline-secondary" href="DepartamentoServletController">Departamentos</a>
	</nav>
</div>
<h1><c:out value="${titulo}"/></h1>


<form action="empleados/crearEmpleados.jsp">
<input type="submit" value="Agregar" class="btn btn-primary"/>
</form> 

<div>
	<table class="table">
		<thead class="table-dark">
			<th>Id Empleado</th>
			<th>TipoDoc</th>
			<th>NumeroDoc</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Id Ciudad</th>
			<th>Nombre Ciudad</th>
			<th>Direccion</th>
			<th>Correo</th>
			<th>Telefono</th>
			<th>Fecha creacion</th>
			<th></th>
			<th></th>
		</thead>
		<tbody>
			<c:forEach var="empleados" items="${Empleados}">
			<tr>
				<td><c:out value="${empleados.idEmpleado}"/></td>
				<td><c:out value="${empleados.tipoDoc}"/></td>
				<td><c:out value="${empleados.numeroDoc}"/></td>
				<td><c:out value="${empleados.nombre}"/></td>
				<td><c:out value="${empleados.apellido}"/></td>
				<td><c:out value="${empleados.ciudad}"/></td>
				<td><c:out value="${empleados.nombreCiudad}"/></td>
				<td><c:out value="${empleados.direccion}"/></td>
				<td><c:out value="${empleados.correo}"/></td>
				<td><c:out value="${empleados.telefono}"/></td>
				<td><c:out value="${empleados.fechaCreacion}"/></td>
				<td><a class="btn btn-success" href="EmpleadosServletController?action=edit&idEmpleado=<c:out value="${empleados.idEmpleado}"></c:out>">Editar</a></td>
				<td><input type="button" value="Eliminar" class="btn btn-danger"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</body>
</html>