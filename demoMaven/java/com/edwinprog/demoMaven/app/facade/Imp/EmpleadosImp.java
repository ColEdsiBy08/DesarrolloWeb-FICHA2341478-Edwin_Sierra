package com.edwinprog.demoMaven.app.facade.Imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.edwinprog.demoMaven.app.data.Conexion;
import com.edwinprog.demoMaven.app.facade.IEmpleados;
import com.edwinprog.demoMaven.app.model.Empleados;

public class EmpleadosImp extends Conexion implements IEmpleados{
	private PreparedStatement pstEmpleados=null;
	private ResultSet rsEmpleados=null;
	private String query="";
	private List<Empleados> listEmpleados=new ArrayList<>();

	@Override
	public List<Empleados> buscarTodos() {
		this.query="select * from Empleados";
		System.out.println("Entro a ejecutar "+query);
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
					this.listEmpleados.add(empleados);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.listEmpleados;
	}

	@Override
	public Empleados buscarPorId(int idEmpleado) {
		// TODO Auto-generated method stub
		Empleados empleados=new Empleados();
		this.query="select * from Empleados where idEmpleado=?";
		try {
			if(this.getConnection()!=null) {
				this.pstEmpleados=this.getConnection().prepareStatement(query);
				this.pstEmpleados.setInt(1, idEmpleado);
				this.rsEmpleados=this.pstEmpleados.executeQuery();
				while(this.rsEmpleados.next()) {
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
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empleados;
	}

	@Override
	public void crearEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean actualizarEmpleados(Empleados empleados) {
		this.query="UPDATE Empleados SET tipoDocumentoIdentidad=?, documentoNumero=?, empleadoNombre=?, empleadoApellido=?, idCiudad=?, nombreCiudad=?, direccion=?, correoElectronico=?, telefono=?, fecha_hora_creacion=?, fecha_hora_modificacion=?"
				+ "where idEmpleado=?";
		try {
			if (this.getConnection()!=null) {
				this.pstEmpleados=this.getConnection().prepareStatement(query);
				this.pstEmpleados.setInt(1, empleados.getIdEmpleado());
				this.pstEmpleados.setString(2, empleados.getTipoDoc());
				this.pstEmpleados.setInt(3, empleados.getNumeroDoc());
				this.pstEmpleados.setString(4, empleados.getNombre());
				this.pstEmpleados.setString(5, empleados.getApellido());
				this.pstEmpleados.setInt(6, empleados.getCiudad());
				this.pstEmpleados.setString(7, empleados.getNombreCiudad());
				this.pstEmpleados.setString(8, empleados.getDireccion());
				this.pstEmpleados.setString(9, empleados.getCorreo());
				this.pstEmpleados.setInt(10, empleados.getTelefono());
				this.pstEmpleados.setDate(11, new java.sql.Date (empleados.getFechaCreacion().getDate()));
				this.pstEmpleados.setDate(12, new java.sql.Date (empleados.getFechaModificacion().getDate()));
				this.pstEmpleados.execute();
			}else {
				System.out.println("Fallo de conexion");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public void eliminarEmpleados(Empleados empleados) {
		// TODO Auto-generated method stub
		
	}


	
}
