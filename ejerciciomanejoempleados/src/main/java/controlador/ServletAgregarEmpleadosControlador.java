package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Empleados;

import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class ServletAgregarEmpleadosControlador
 */
@WebServlet("/ServletAgregarEmpleadosControlador")
public class ServletAgregarEmpleadosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Empleados> listaEmpleados= new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgregarEmpleadosControlador() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Empleados empleados = new Empleados();
		this.listaEmpleados.add(empleados);
		request.setAttribute("lista", listaEmpleados);
		request.getRequestDispatcher("Empleados/AgregarEmpleados.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
