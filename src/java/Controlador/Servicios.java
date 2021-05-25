
package Controlador;

import Servicios.ClienteService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servicios extends HttpServlet {

    String add = "RegistroUsuario.jsp";
    String acceso="";
    
    ClienteService cliservice = new ClienteService();
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        
        if(accion.equals("add")){
            acceso = add;
        }
        else if(accion.equals("Guardar")){
            String apellidos = request.getParameter("txtape");
            String direccion = request.getParameter("txtdirec");
            String email = request.getParameter("txtemail");
            String nombre = request.getParameter("txtname");
            String numDoc = request.getParameter("txtdni");
            String password = request.getParameter("txtpass");
            String telefono = request.getParameter("txtef");
            String usuario = request.getParameter("txtuser");
            cliservice.add(apellidos, direccion, email, nombre, numDoc, password, telefono, usuario);
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
        
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
