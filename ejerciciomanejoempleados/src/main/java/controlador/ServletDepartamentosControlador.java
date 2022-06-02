package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Departamentos;
import negocio.DepartamentoImp;

/**
 * Servlet implementation class ServletDepartamentosControlador
 */
@WebServlet("/ServletDepartamentosControlador")
public class ServletDepartamentosControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamentos> listaDepartamentos=new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDepartamentosControlador() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepartamentoImp departamentoImp=new DepartamentoImp();
		this.listaDepartamentos=departamentoImp.findAll();
		request.setAttribute("departamentos", listaDepartamentos);
		request.getRequestDispatcher("Departamentos/ListDepartamentos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
