package com.edwinprog.demoMaven.app.model;

public class Ciudades {
	//atributos
		private int idCiudad;
		private int idDepartamento;
		private String nombreCiudad;
		private int codigoCiudad;
		
		//contructor por defecto
		
			public Ciudades() {}
			
		//contructor sobre cargado
			
			public Ciudades(int idCiudad, int idDepartamento, String nombreCiudad, int codigoCiudad) {
				super();
				this.idCiudad = idCiudad;
				this.idDepartamento = idDepartamento;
				this.nombreCiudad = nombreCiudad;
				this.codigoCiudad = codigoCiudad;
			}

			public int getIdCiudad() {
				return idCiudad;
			}

			public void setIdCiudad(int idCiudad) {
				this.idCiudad = idCiudad;
			}

			public int getIdDepartamento() {
				return idDepartamento;
			}

			public void setIdDepartamento(int idDepartamento) {
				this.idDepartamento = idDepartamento;
			}

			public String getNombreCiudad() {
				return nombreCiudad;
			}

			public void setNombreCiudad(String nombreCiudad) {
				this.nombreCiudad = nombreCiudad;
			}

			public int getCodigoCiudad() {
				return codigoCiudad;
			}

			public void setCodigoCiudad(int codigoCiudad) {
				this.codigoCiudad = codigoCiudad;
			}
			
}
