package Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Empleados;
import Negocio.EmpleadoImp;


public class ServletEmpleadosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<Empleados> listaEmpleados=new ArrayList<>();
   
    public ServletEmpleadosController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpleadoImp empleadoImp=new EmpleadoImp();
		this.listaEmpleados=empleadoImp.findAll();
		request.setAttribute("empleados", listaEmpleados);
		request.getRequestDispatcher("Empleados/ListEmpleados.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}