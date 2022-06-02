package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Empleados;
import negocio.EmpleadoImp;

/**
 * Servlet implementation class ServletEmpleadosControlador
 */
@WebServlet("/ServletEmpleadosControlador")
public class ServletEmpleadosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Empleados> listaEmpleados=new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEmpleadosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpleadoImp empleadoImp=new EmpleadoImp();
		this.listaEmpleados=empleadoImp.findAll();
		request.setAttribute("empleados", listaEmpleados);
		request.getRequestDispatcher("Empleados/ListEmpleados.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
