package com.edwinprog.demoMaven.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edwinprog.demoMaven.app.facade.Imp.CiudadesImp;
import com.edwinprog.demoMaven.app.model.Ciudades;
import com.edwinprog.demoMaven.app.utilities.Utility;

/**
 * Servlet implementation class CiudadesServletController
 */
public class CiudadesServletController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private List<Ciudades> listaCiudad=new ArrayList<>();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CiudadesServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CiudadesImp CiudadesImp= new CiudadesImp();
			if (request.getParameter("action")!=null) {
				String action=request.getParameter("action");
				switch (action) {
				case "edit":
					System.out.println("@Editar");
					int idCiudad=Integer.parseInt(request.getParameter("idCiudad"));
					Ciudades ciudad=CiudadesImp.buscarPorId(idCiudad);
					request.setAttribute("ciudad", ciudad);
					request.setAttribute("titulo", "Editar Ciudad");
					request.getRequestDispatcher("ciudad/updateCiudad.jsp").forward(request, response);
					break;
				
				case "actualizar":
					System.out.println("@actualizar");
					Ciudades ciudades1=new Ciudades();
					ciudades1.setIdCiudad(Integer.parseInt(request.getParameter("id")));
					ciudades1.setIdDepartamento(Integer.parseInt(request.getParameter("idDep")));
					ciudades1.setNombreCiudad(request.getParameter("nombre"));
					ciudades1.setCodigoCiudad(Integer.parseInt(request.getParameter("codigo")));
					CiudadesImp.actualizarCiudad(ciudades1);
					break;
					
				default:
					this.listaCiudad=CiudadesImp.buscarTodos();
					request.setAttribute("titulo", "Lista Ciudades");
					request.setAttribute("Ciudades", this.listaCiudad);
					request.getRequestDispatcher("ciudades/listCiudades.jsp").forward(request, response);
					break;
				}
				
			}else {
				this.listaCiudad=CiudadesImp.buscarTodos();
				request.setAttribute("titulo", "Lista Ciudades");
				request.setAttribute("Ciudades", this.listaCiudad);
				request.getRequestDispatcher("ciudades/listCiudades.jsp").forward(request, response);
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
