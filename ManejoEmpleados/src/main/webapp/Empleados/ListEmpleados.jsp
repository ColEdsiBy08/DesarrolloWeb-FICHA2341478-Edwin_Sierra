<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="Modelo.Empleados" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
 	<h1>Lista de Empleados</h1>
 	<%!List<Empleados> listaEmpleados; %>
 	<% 
 	try{
		listaEmpleados=(List<Empleados>) request.getAttribute("Empleados");
		Iterator<Empleados> item=listaEmpleados.iterator();
 	%>
 	<div>
 		<table class="table">
			<thead class="table-light">
				<th>tipoDoc</th>
				<th>NumeroDoc</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Ciudad</th>
				<th>Direccion</th>
				<th>Correo</th>
				<th>Telefono</th>
			</thead>
			<tbody>
			<% while(item.hasNext()){
				Empleados empleados= item.next();%>
				<tr>
					<td><%= empleados.getTipoDoc() %></td>
					<td><%= empleados.getNumeroDoc() %></td>
					<td><%= empleados.getNombre() %></td>
					<td><%= empleados.getApellido() %></td>
					<td><%= empleados.getCiudad() %></td>
					<td><%= empleados.getDireccion() %></td>
					<td><%= empleados.getCorreo() %></td>
					<td><%= empleados.getTelefono() %></td>
				</tr>
			</tbody>
			<%} %>
 		</table>
 	</div>
 <%}catch(Exception e){} %>
</body>
</html>