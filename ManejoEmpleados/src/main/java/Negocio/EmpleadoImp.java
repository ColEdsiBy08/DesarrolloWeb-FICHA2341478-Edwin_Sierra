package Negocio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Modelo.Empleados;
import data.Conexion;

public class EmpleadoImp extends Conexion{
	private PreparedStatement pstEmpleados=null;
	private ResultSet rsEmpleados=null;
	private String query="";
	private List<Empleados> listaEmpleados= new ArrayList<>();
	
	public List<Empleados> findAll(){
		
		this.query="SELECT * FROM Empleados";
		try {
			if(this.getConnection()!=null) {
				this.pstEmpleados=this.getConnection().prepareStatement(query);
				this.rsEmpleados=this.pstEmpleados.executeQuery();
				while(this.rsEmpleados.next()) {
					Empleados empleados=new Empleados();
					empleados.setTipoDoc(this.rsEmpleados.getInt("tipoDoc"));
					empleados.setNumeroDoc(this.rsEmpleados.getInt("numeroDoc"));
					empleados.setNombre(this.rsEmpleados.getString("nombre"));
					empleados.setApellido(this.rsEmpleados.getString("apellido"));
					empleados.setCiudad(this.rsEmpleados.getInt("ciudad"));
					empleados.setDireccion(this.rsEmpleados.getString("direccion"));
					empleados.setCorreo(this.rsEmpleados.getString("correo"));
					empleados.setTelefono(this.rsEmpleados.getInt("telefono"));
					this.listaEmpleados.add(empleados);
				}
			}else {
				System.out.println("Fallo la conexion");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.listaEmpleados;
	}
}
