package com.edwinprog.demoMaven.app.facade;

import java.util.List;

import com.edwinprog.demoMaven.app.model.Ciudades;

public interface ICiudades {
	public List<Ciudades> buscarTodos();
	public Ciudades buscarPorId(int IdCiudad);
	public void crearCiudad(Ciudades ciudad);
	public boolean actualizarCiudad(Ciudades ciudad);
	public void eliminarCiudad(Ciudades ciudad);
	
}
