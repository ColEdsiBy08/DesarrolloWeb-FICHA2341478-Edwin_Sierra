package com.edwinprog.demoMaven.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edwinprog.demoMaven.app.facade.Imp.DepartamentoImp;
import com.edwinprog.demoMaven.app.model.Departamento;
import com.edwinprog.demoMaven.app.utilities.Utility;

/**
 * Servlet implementation class DepartamentoServletController
 */
public class DepartamentoServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamento> listaDepartamento=new ArrayList<>();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartamentoServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DepartamentoImp departamentoImp= new DepartamentoImp();
			if (request.getParameter("action")!=null) {
				String action=request.getParameter("action");
				switch (action) {
				case "edit":
					System.out.println("@Editar");
					int idDepartamento=Integer.parseInt(request.getParameter("idDepartamento"));
					Departamento departamento=departamentoImp.buscarPorId(idDepartamento);
					request.setAttribute("departamento", departamento);
					request.setAttribute("titulo", "Editar Departamento");
					request.getRequestDispatcher("departamento/updateDepartamento.jsp").forward(request, response);
					break;
				
				case "actualizar":
					System.out.println("@actualizar");
					Departamento departamento1=new Departamento();
					departamento1.setIdDepartamento(Integer.parseInt(request.getParameter("id")));
					departamento1.setCodigoDepartamento(Integer.parseInt(request.getParameter("codigo")));
					departamento1.setNombreDepartamento(request.getParameter("nombre"));
					departamento1.setFechaCreacion(Utility.convertirFecha(request.getParameter("fecha_crea")));
					departamento1.setFechaModificacion(new Date());
					departamentoImp.actualizarDepartamento(departamento1);
					break;
					
				default:
					this.listaDepartamento=departamentoImp.buscarTodos();
					request.setAttribute("titulo", "Lista Departamentos");
					request.setAttribute("Departamentos", this.listaDepartamento);
					request.getRequestDispatcher("departamento/listDepartamentos.jsp").forward(request, response);
					break;
				}
				
			}else {
				this.listaDepartamento=departamentoImp.buscarTodos();
				request.setAttribute("titulo", "Lista Departamentos");
				request.setAttribute("Departamentos", this.listaDepartamento);
				request.getRequestDispatcher("departamento/listDepartamentos.jsp").forward(request, response);
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
