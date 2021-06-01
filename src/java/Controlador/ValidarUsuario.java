
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Usuario.Usuario;
import Usuario.UsuarioValidar;

public class ValidarUsuario extends HttpServlet {
    
    UsuarioValidar udao = new UsuarioValidar();
    Usuario u = new Usuario();

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion =request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            String user=request.getParameter("txtuser");
            String pass=request.getParameter("txtpass");
            u=udao.Validar(user, pass);
            if(u.getUsuario()!=null){
                request.setAttribute("cliente", u);
                request.getRequestDispatcher("Controlador?accion=home").forward(request, response);
            }else{
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }else{
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
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
