package negocio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import data.Conexion;
import modelo.Departamentos;

public class DepartamentoImp extends Conexion{
	private PreparedStatement pstDepartamentos=null;
	private ResultSet rsDepartamentos=null;
	private String query="";
	private List<Departamentos> listaDepartamentos= new ArrayList<>();
	
public List<Departamentos> findAll(){
		
		this.query="SELECT * FROM Departamentos";
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamentos=this.getConnection().prepareStatement(query);
				this.rsDepartamentos=this.pstDepartamentos.executeQuery();
				while(this.rsDepartamentos.next()) {
					Departamentos departamentos=new Departamentos();
					departamentos.setIdDepartamento(this.rsDepartamentos.getInt("idDepartamento"));
					departamentos.setCodigoDepartamento(this.rsDepartamentos.getInt("departamentoCodigo"));
					departamentos.setNombreDepartamento(this.rsDepartamentos.getString("departamentoNombre"));
					departamentos.setFechaCreacion(this.rsDepartamentos.getDate("fecha_hora_creacion"));
					departamentos.setFechaModificacion(this.rsDepartamentos.getDate("fecha_hora_modificacion"));
					this.listaDepartamentos.add(departamentos);
				}
			}else {
				System.out.println("Fallo la conexion");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.listaDepartamentos;
	}
}
