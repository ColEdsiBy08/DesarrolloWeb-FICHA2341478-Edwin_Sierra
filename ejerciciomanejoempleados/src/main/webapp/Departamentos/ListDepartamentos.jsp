<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ page import="modelo.Departamentos" %>
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
	<h1>Lista de Departamentos</h1>
 	<%!List<Departamentos> listaDepartamentos; %>
 	<% 
 	try{
		listaDepartamentos=(List<Departamentos>) request.getAttribute("departamentos");
		Iterator<Departamentos> item=listaDepartamentos.iterator();
 	%>
 	<a class="btn btn-dark" href="#">Agregar</a>
 	<br><br>
 	<div>
 		<table class="table table-striped">
			<thead>
				<th>IdDepartamento</th>
				<th>CodigoDepartamento</th>
				<th>NombreDepartamento</th>
				<th>FechaCreacion</th>
				<th>FechaModificacion</th>
				<th></th>
				<th></th>
			</thead>
			<tbody>
			<% while(item.hasNext()){
				Departamentos departamentos= item.next();%>
				<tr>
					<td><%= departamentos.getIdDepartamento() %></td>
					<td><%= departamentos.getCodigoDepartamento() %></td>
					<td><%= departamentos.getNombreDepartamento() %></td>
					<td><%= departamentos.getFechaCreacion() %></td>
					<td><%= departamentos.getFechaModificacion() %></td>
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