package com.edwinprog.demoMaven.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edwinprog.demoMaven.app.facade.Imp.EmpleadosImp;
import com.edwinprog.demoMaven.app.model.Empleados;
import com.edwinprog.demoMaven.app.utilities.Utility;

public class EmpleadosServletController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private List<Empleados> listaEmpleados=new ArrayList<>();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadosServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmpleadosImp empleadosImp= new EmpleadosImp();
			if (request.getParameter("action")!=null) {
				String action=request.getParameter("action");
				switch (action) {
				case "edit":
					System.out.println("@Editar");
					int idEmpleado=Integer.parseInt(request.getParameter("idEmpleado"));
					Empleados empleados=empleadosImp.buscarPorId(idEmpleado);
					request.setAttribute("empleados", empleados);
					request.setAttribute("titulo", "Editar empleados");
					request.getRequestDispatcher("empleados/updateEmpleados.jsp").forward(request, response);
					break;
				
				case "actualizar":
					System.out.println("@actualizar");
					Empleados empleados1=new Empleados();
					empleados1.setIdEmpleado(Integer.parseInt(request.getParameter("id")));
					empleados1.setTipoDoc(request.getParameter("TipoDoc"));
					empleados1.setNumeroDoc(Integer.parseInt(request.getParameter("NumeroDoc")));
					empleados1.setNombre(request.getParameter("nombre"));
					empleados1.setApellido(request.getParameter("apellido"));
					empleados1.setCiudad(Integer.parseInt(request.getParameter("idCiudad")));
					empleados1.setNombreCiudad(request.getParameter("nombreCiudad"));
					empleados1.setDireccion(request.getParameter("direccion"));
					empleados1.setCorreo(request.getParameter("correo"));
					empleados1.setTelefono(Integer.parseInt(request.getParameter("telefonoEmpleado")));
					empleados1.setFechaCreacion(Utility.convertirFecha(request.getParameter("fecha_crea")));
					empleados1.setFechaModificacion(new Date());
					empleadosImp.actualizarEmpleados(empleados1);
					break;
					
				default:
					this.listaEmpleados=empleadosImp.buscarTodos();
					request.setAttribute("titulo", "Lista Empleados");
					request.setAttribute("Empleados", this.listaEmpleados);
					request.getRequestDispatcher("empleados/listEmpleados.jsp").forward(request, response);
					break;
				}
				
			}else {
				this.listaEmpleados=empleadosImp.buscarTodos();
				request.setAttribute("titulo", "Lista Empleados");
				request.setAttribute("Empleados", this.listaEmpleados);
				request.getRequestDispatcher("empleados/listEmpleados.jsp").forward(request, response);
			}
		 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
