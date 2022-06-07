package com.edwinprog.demoMaven.app.data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
	//Atributos para establecer la conexion
	private String db="manejoempleados";
	private Connection cnx=null;
	private String usuario="root";
	private String password="123456789";
	private String url="jdbc:mysql://localhost:3306/"+db;
	//Constructor por defecto
	public Conexion() {}
	//Constructor sobre cargado
	public Conexion(String db,Connection cnx, String usuario, String password, String url) {
		super();
		this.db=db;
		this.cnx=cnx;
		this.usuario=usuario;
		this.password=password;
		this.url=url;
	}
	
	public Connection getConnection()throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		cnx=DriverManager.getConnection(url,usuario,password);
		return cnx;
	}
}
