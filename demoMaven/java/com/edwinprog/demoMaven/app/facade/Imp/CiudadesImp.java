package com.edwinprog.demoMaven.app.facade.Imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edwinprog.demoMaven.app.data.Conexion;
import com.edwinprog.demoMaven.app.facade.ICiudades;
import com.edwinprog.demoMaven.app.model.Ciudades;

public class CiudadesImp extends Conexion implements ICiudades{
	private PreparedStatement pstCiudades=null;
	private ResultSet rsCiudades=null;
	private String query="";
	private List<Ciudades> listCiudad=new ArrayList<>();

	@Override
	public List<Ciudades> buscarTodos() {
		this.query="select * from Ciudades";
		System.out.println("Entro a ejecutar "+query);
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
					this.listCiudad.add(ciudades);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listCiudad;
	}

	@Override
	public Ciudades buscarPorId(int idCiudad) {
		// TODO Auto-generated method stub
		Ciudades ciudades=new Ciudades();
		this.query="select * from Ciudades where idCiudad=?";
		try {
			if(this.getConnection()!=null) {
				this.pstCiudades=this.getConnection().prepareStatement(query);
				this.pstCiudades.setInt(1, idCiudad);
				this.rsCiudades=this.pstCiudades.executeQuery();
				while(this.rsCiudades.next()) {
					ciudades.setIdCiudad(this.rsCiudades.getInt("idCiudad"));
					ciudades.setIdDepartamento(this.rsCiudades.getInt("idDepartamento"));
					ciudades.setNombreCiudad(this.rsCiudades.getString("nombreCiudad"));
					ciudades.setCodigoCiudad(this.rsCiudades.getInt("codigoCiudad"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ciudades;
	}

	@Override
	public void crearCiudad(Ciudades ciudades) {
		
	}
	
	@Override
	public boolean actualizarCiudad(Ciudades ciudades) {
		this.query="UPDATE Departamentos SET departamentoCodigo=?, departamentoNombre=?, fecha_hora_creacion=?, fecha_hora_modificacion=?"
				+ "where idDepartamento=?";
		try {
			if (this.getConnection()!=null) {
				this.pstCiudades=this.getConnection().prepareStatement(query);
				this.pstCiudades.setInt(1, ciudades.getIdCiudad());
				this.pstCiudades.setInt(2, ciudades.getIdDepartamento());
				this.pstCiudades.setString(3, ciudades.getNombreCiudad());
				this.pstCiudades.setInt(4, ciudades.getCodigoCiudad());
				this.pstCiudades.execute();
			}else {
				System.out.println("Fallo de conexion");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public void eliminarCiudad(Ciudades ciudad) {
		// TODO Auto-generated method stub
		
	}


	
}
