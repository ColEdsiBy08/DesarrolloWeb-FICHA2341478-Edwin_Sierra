package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Ciudades;
import negocio.CiudadesImp;

/**
 * Servlet implementation class ServletCiudadesControlador
 */
@WebServlet("/ServletCiudadesControlador")
public class ServletCiudadesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Ciudades> listaCiudades=new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCiudadesControlador() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CiudadesImp ciudadesImp=new CiudadesImp();
		this.listaCiudades=ciudadesImp.findAll();
		request.setAttribute("ciudades", listaCiudades);
		request.getRequestDispatcher("Ciudades/ListCiudades.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
