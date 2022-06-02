package negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import data.Conexion;
import modelo.Empleados;

public class AgregarEmpleadosImp extends Conexion{
	private PreparedStatement pstAgregarEmpleados=null;
	private ResultSet rsAgregarEmpleados=null;
	private String query="";
	private List<Empleados> listaEmpleados= new ArrayList<>();
	
	public List<Empleados> findAll(){
			
		this.query="INSERT INTO Empleados(idEmpleado, tipoDocumentoIdentidad, documentoNumero, empleadoNombre, empleadoApellido, "
				+ "idCiudad, nombreCiudad, direccion, correoElectronico, telefonoEmpleado, fecha_hora_creacion, "
				+ "fecha_hora_modificacion) values(?,?,?,?,?,?,?,?,?,?,?))";
		
		try {
			if(this.getConnection()!=null) {
				this.pstAgregarEmpleados=this.getConnection().prepareStatement(query);
				this.pstAgregarEmpleados.setInt(1, 0);
				this.pstAgregarEmpleados.setString(2, query);
				this.pstAgregarEmpleados.setInt(3, 1);
				this.pstAgregarEmpleados.setString(4, query);
				this.pstAgregarEmpleados.setString(5, query);
				this.pstAgregarEmpleados.setInt(6, 2);
				this.pstAgregarEmpleados.setString(7, query);
				this.pstAgregarEmpleados.setString(8, query);
				this.pstAgregarEmpleados.setString(9, query);
				this.pstAgregarEmpleados.setInt(10, 3);
				this.pstAgregarEmpleados.setDate(11, null);
				this.pstAgregarEmpleados.setDate(12, null);
				}		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.listaEmpleados;
	}
	}