package Modelo;

public class Empleados {

	private int tipoDoc;
	private int numeroDoc;
	private String nombre;
	private String apellido;
	private int ciudad;
	private String direccion;
	private String correo;
	private int telefono;
	
	public Empleados() {}
	
	public Empleados(int tipoDoc, int numeroDoc, String nombre, String apellido, int ciudad, String direccion, String correo, int telefono) {
		super();
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
	}

	public int getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(int tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public int getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(int numeroDoc) {
		this.numeroDoc = numeroDoc;
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
	
}
	
