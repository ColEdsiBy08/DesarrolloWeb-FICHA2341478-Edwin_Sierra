package modelo;

import java.util.Date;

public class Departamentos {
	//Atributos
	private int idDepartamento;
	private int codigoDepartamento;
	private String nombreDepartamento;
	private Date fechaCreacion;
	private Date fechaModificacion;
	
	//contructor por defecto
	
	public Departamentos() {}
	
	//contructor sobre cargado
	
	public Departamentos(int idDepartamento, int codigoDepartamento, String nombreDepartamento, Date fechaCreacion, Date fechaModificacion) {
		super();
		this.idDepartamento = idDepartamento;
		this.codigoDepartamento = codigoDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
}
