<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="modelo.Ciudades" %>
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
	<h1>Lista de Ciudades</h1>
 	<%!List<Ciudades> listaCiudades; %>
 	<% 
 	try{
		listaCiudades=(List<Ciudades>) request.getAttribute("ciudades");
		Iterator<Ciudades> item=listaCiudades.iterator();
 	%>
 	<a class="btn btn-dark" href="#">Agregar</a>
 	<br><br>
 	<div>
 		<table class="table table-striped">
			<thead>
				<th>IdCiudad</th>
				<th>IdDepartamento</th>
				<th>NombreCiudad</th>
				<th>CodigoCiudad</th>
				<th></th>
				<th></th>
			</thead>
			<tbody>
			<% while(item.hasNext()){
				Ciudades ciudades= item.next();%>
				<tr>
					<td><%= ciudades.getIdCiudad() %></td>
					<td><%= ciudades.getIdDepartamento() %></td>
					<td><%= ciudades.getNombreCiudad() %></td>
					<td><%= ciudades.getCodigoCiudad() %></td>
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