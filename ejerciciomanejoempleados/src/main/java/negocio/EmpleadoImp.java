package negocio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import data.Conexion;
import modelo.Empleados;

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
					empleados.setIdEmpleado(this.rsEmpleados.getInt("idEmpleado"));
					empleados.setTipoDoc(this.rsEmpleados.getString("tipoDocumentoIdentidad"));
					empleados.setNumeroDoc(this.rsEmpleados.getInt("documentoNumero"));
					empleados.setNombre(this.rsEmpleados.getString("empleadoNombre"));
					empleados.setApellido(this.rsEmpleados.getString("empleadoApellido"));
					empleados.setCiudad(this.rsEmpleados.getInt("idCiudad"));
					empleados.setNombreCiudad(this.rsEmpleados.getString("nombreCiudad"));
					empleados.setDireccion(this.rsEmpleados.getString("direccion"));
					empleados.setCorreo(this.rsEmpleados.getString("correoElectronico"));
					empleados.setTelefono(this.rsEmpleados.getInt("telefonoEmpleado"));
					empleados.setFechaCreacion(this.rsEmpleados.getDate("fecha_hora_creacion"));
					empleados.setFechaModificacion(this.rsEmpleados.getDate("fecha_hora_modificacion"));
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
