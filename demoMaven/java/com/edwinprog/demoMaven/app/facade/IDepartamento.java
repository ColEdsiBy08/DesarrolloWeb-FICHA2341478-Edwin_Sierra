package com.edwinprog.demoMaven.app.facade;

import java.util.List;

import com.edwinprog.demoMaven.app.model.Departamento;

public interface IDepartamento {

	public List<Departamento> buscarTodos();
	public Departamento buscarPorId(int Id_Departamentos);
	public void crearDepartamento(Departamento departamento);
	public boolean actualizarDepartamento(Departamento departamento);
	public void eliminarDepartamento(Departamento departamento);
	
}
