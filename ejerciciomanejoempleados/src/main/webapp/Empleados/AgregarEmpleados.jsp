<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Empleados" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form action="ServletEmpleadosControlador" method="get">
		<div class="form-group">
			<label>Tipo de documento de identidad:</label>
			<input type="text" name="tipoDoc">
		</div>
		<div class="form-group">
			<label>Numero de documento:</label>
			<input type="number" name="numDoc">
		</div>
		<div class="form-group">
			<label>Nombres de empleado:</label>
			<input type="text" name="nombresEmpleado">
		</div>
		<div class="form-group">
			<label>Apellidos de empleado:</label>
			<input type="text" name="apellidoEmpleado">
		</div>
		<div class="form-group">
			<label>IdCiudad:</label>
			<input type="text" name="idCiudad">
		</div>
		<div class="form-group">
			<label>Nombre de la ciudad:</label>
			<input type="text" name="nombreCiudad">
		</div>
		<div class="form-group">
			<label>Dirección:</label>
			<input type="text" name="direccion">
		</div>
		<div class="form-group">
			<label>Correo electronico:</label>
			<input type="text" name="correo">
		</div>
		<div class="form-group">
			<label>Telefono:</label>
			<input type="text" name="telefono">
		</div>
		<div class="form-group">
			<label>Fecha de creación:</label>
			<input type="datetime" name="FechaCreacion">
		</div>
		<div class="form-group">
			<label>Fecha de modificación:</label>
			<input type="datetime" name="FechaModificacion">
		</div>
		<div >
			<input type="submit" value="Guardar" class="btn btn-dark">
		</div>
		</form>
	</div>
	<%! List<Empleados> listaEmpleados; %>
	<%
		listaEmpleados=(List<Empleados>) request.getAttribute("lista");
		Iterator<Empleados> item= listaEmpleados.iterator();
	%>
</body>
</html>