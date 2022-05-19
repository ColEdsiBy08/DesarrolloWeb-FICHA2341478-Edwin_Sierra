<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="modelo.Persona" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="ServletPersonaController" method="get">
		<div>
			<label>Nombre:</label>
			<input type="text" name="nombre">
		</div>
		<div>
			<label>Apellido:</label>
			<input type="text" name="apellido">
		</div>
		<div>
			<input type="submit" value="enviar">
		</div>
		</form>
	</div>
	<%! List<Persona> listPersona; %>
	<% 
	try{
	listPersona=(List<Persona>) request.getAttribute("lista");
	Iterator<Persona> item=listPersona.iterator();
	%>
	<table>
		<thead>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Acciones</th>
		</thead>
		<tbody>
		<% while(item.hasNext()){
			Persona persona=item.next();
		%>
			<tr>
				<td><%= persona.getNombre() %></td>
				<td><%= persona.getApellido() %></td>
				<td><a href="#"></a></td>
			</tr>
			<% } 
	}catch(Exception e){}
			%>
		</tbody>
	</table>
</body>
</html>