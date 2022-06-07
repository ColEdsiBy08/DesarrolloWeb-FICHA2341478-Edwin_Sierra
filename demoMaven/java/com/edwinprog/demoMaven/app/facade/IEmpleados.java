package com.edwinprog.demoMaven.app.facade;

import java.util.List;

import com.edwinprog.demoMaven.app.model.Empleados;

public interface IEmpleados {
	public List<Empleados> buscarTodos();
	public Empleados buscarPorId(int IdEmpleado);
	public void crearEmpleados(Empleados empleados);
	public boolean actualizarEmpleados(Empleados empleados);
	public void eliminarEmpleados(Empleados empleados);
}	
