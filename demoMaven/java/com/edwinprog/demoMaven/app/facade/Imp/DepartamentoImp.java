package com.edwinprog.demoMaven.app.facade.Imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edwinprog.demoMaven.app.data.Conexion;
import com.edwinprog.demoMaven.app.facade.IDepartamento;
import com.edwinprog.demoMaven.app.model.Departamento;

public class DepartamentoImp extends Conexion implements IDepartamento {
	
	private PreparedStatement pstDepartamento=null;
	private ResultSet rsDepartamento=null;
	private String query="";
	private List<Departamento> listDepartamento=new ArrayList<>();

	@Override
	public List<Departamento> buscarTodos() {
		this.query="select * from Departamentos";
		System.out.println("Entro a ejecutar "+query);
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.rsDepartamento=this.pstDepartamento.executeQuery();
				while(this.rsDepartamento.next()) {
					Departamento departamento=new Departamento();
					departamento.setIdDepartamento(this.rsDepartamento.getInt("idDepartamento"));
					departamento.setCodigoDepartamento(this.rsDepartamento.getInt("departamentoCodigo"));
					departamento.setNombreDepartamento(this.rsDepartamento.getString("departamentoNombre"));
					departamento.setFechaCreacion(this.rsDepartamento.getDate("fecha_hora_creacion"));
					departamento.setFechaModificacion(this.rsDepartamento.getDate("fecha_hora_modificacion"));
					this.listDepartamento.add(departamento);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listDepartamento;
	}

	@Override
	public Departamento buscarPorId(int idDepartamento) {
		// TODO Auto-generated method stub
		Departamento departamento=new Departamento();
		this.query="select * from Departamentos where idDepartamento=?";
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.pstDepartamento.setInt(1, idDepartamento);
				this.rsDepartamento=this.pstDepartamento.executeQuery();
				while(this.rsDepartamento.next()) {
					departamento.setIdDepartamento(this.rsDepartamento.getInt("idDepartamento"));
					departamento.setCodigoDepartamento(this.rsDepartamento.getInt("codigoDepartamento"));
					departamento.setNombreDepartamento(this.rsDepartamento.getString("nombreDepartamento"));
					departamento.setFechaCreacion(this.rsDepartamento.getDate("fechaCreacion"));
					departamento.setFechaModificacion(this.rsDepartamento.getDate("fechaModificacion"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return departamento;
	}

	@Override
	public void crearDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean actualizarDepartamento(Departamento departamento) {
		this.query="UPDATE Departamentos SET departamentoCodigo=?, departamentoNombre=?, fecha_hora_creacion=?, fecha_hora_modificacion=?"
				+ "where idDepartamento=?";
		try {
			if (this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.pstDepartamento.setInt(1, departamento.getIdDepartamento());
				this.pstDepartamento.setInt(2, departamento.getCodigoDepartamento());
				this.pstDepartamento.setString(3, departamento.getNombreDepartamento());
				this.pstDepartamento.setDate(4, new java.sql.Date (departamento.getFechaCreacion().getDate()));
				this.pstDepartamento.setDate(5, new java.sql.Date (departamento.getFechaModificacion().getDate()));
				this.pstDepartamento.execute();
			}else {
				System.out.println("Fallo de conexion");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public void eliminarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}


	
}
