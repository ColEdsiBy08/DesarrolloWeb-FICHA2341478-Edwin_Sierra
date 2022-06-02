package modelo;

import java.util.Date;

public class Empleados {
	private int idEmpleado;
	private String tipoDoc;
	private int numeroDoc;
	private String nombre;
	private String apellido;
	private int ciudad;
	private String nombreCiudad;
	private String direccion;
	private String correo;
	private int telefono;
	private Date fechaCreacion;
	private Date fechaModificacion;
	
	public Empleados() {}
	
	public Empleados(int idEmpleado, String tipoDoc, int numeroDoc, String nombre, String apellido, int ciudad, String nombreCiudad,String direccion, String correo, int telefono, Date fechaCreacion, Date fechaModificacion) {
		super();
		this.idEmpleado = idEmpleado;
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.nombreCiudad = nombreCiudad;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public int getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(int documentoNumero) {
		this.numeroDoc = documentoNumero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCiudad() {
		return ciudad;
	}

	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
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
