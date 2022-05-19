package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Persona;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ServletPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<Persona> listPersonas= new ArrayList<Persona>();
       
    public ServletPersonaController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		Persona persona=new Persona();
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		this.listPersonas.add(persona);
		request.setAttribute("lista", listPersonas);
		request.getRequestDispatcher("index,jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
