package negocio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import data.Conexion;
import modelo.Ciudades;

public class CiudadesImp extends Conexion{
	private PreparedStatement pstCiudades=null;
	private ResultSet rsCiudades=null;
	private String query="";
	private List<Ciudades> listaCiudades= new ArrayList<>();
	
public List<Ciudades> findAll(){
		
		this.query="SELECT * FROM Ciudades";
		try {
			if(this.getConnection()!=null) {
				this.pstCiudades=this.getConnection().prepareStatement(query);
				this.rsCiudades=this.pstCiudades.executeQuery();
				while(this.rsCiudades.next()) {
					Ciudades ciudades=new Ciudades();
					ciudades.setIdCiudad(this.rsCiudades.getInt("idCiudad"));
					ciudades.setIdDepartamento(this.rsCiudades.getInt("idDepartamento"));
					ciudades.setNombreCiudad(this.rsCiudades.getString("nombreCiudad"));
					ciudades.setCodigoCiudad(this.rsCiudades.getInt("codigoCiudad"));
					this.listaCiudades.add(ciudades);
				}
			}else {
				System.out.println("Fallo la conexion");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.listaCiudades;
	}
}
