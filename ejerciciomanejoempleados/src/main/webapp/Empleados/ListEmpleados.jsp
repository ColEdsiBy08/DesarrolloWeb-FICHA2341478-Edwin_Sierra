<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ page import="modelo.Empleados" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<a class="btn btn-outline-secondary" href="ServletEmpleadosControlador">Empleados</a>
<a class="btn btn-outline-secondary" href="ServletCiudadesControlador">Ciudades</a>
<a class="btn btn-outline-secondary" href="ServletDepartamentosControlador">Departamentos</a>
	<h1>Lista de Empleados</h1>
 	<%!List<Empleados> listaEmpleados; %>
 	<% 
 	try{
		listaEmpleados=(List<Empleados>) request.getAttribute("empleados");
		Iterator<Empleados> item=listaEmpleados.iterator();
 	%>
 	<a class="btn btn-dark" href="ServletAgregarEmpleadosControlador">Agregar</a>
 	<br><br>
 	<div>
 		<table class="table table-striped">
			<thead>
				<th>IdEmpleado</th>
				<th>tipoDoc</th>
				<th>NumeroDoc</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Ciudad</th>
				<th>NombreCiudad</th>
				<th>Direccion</th>
				<th>Correo</th>
				<th>Telefono</th>
				<th>fechaCreacion</th>
				<th>fechaModificacion</th>
				<th></th>
				<th></th>
			</thead>
			<tbody>
			<% while(item.hasNext()){
				Empleados empleados= item.next();%>
				<tr>
					<td><%= empleados.getIdEmpleado() %></td>
					<td><%= empleados.getTipoDoc() %></td>
					<td><%= empleados.getNumeroDoc() %></td>
					<td><%= empleados.getNombre() %></td>
					<td><%= empleados.getApellido() %></td>
					<td><%= empleados.getCiudad() %></td>
					<td><%= empleados.getNombreCiudad() %></td>
					<td><%= empleados.getDireccion() %></td>
					<td><%= empleados.getCorreo() %></td>
					<td><%= empleados.getTelefono() %></td>
					<td><%= empleados.getFechaCreacion() %></td>
					<td><%= empleados.getFechaModificacion() %></td>
					<td><a class="btn btn-primary" href="#">Editar</a></td>
					<td><a class="btn btn-danger" href="#">Eliminar</a></td>
				</tr>
			</tbody>
			<%} %>
 		</table>
 	</div>
 <%}catch(Exception e){} %>
</body>
</html>