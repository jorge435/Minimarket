
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String accion = request.getParameter("accion");
            switch (accion) {
                case "Principal":
                    request.getRequestDispatcher("menu.jsp").forward(request, response);
                    break;
                case "Producto":
                    request.getRequestDispatcher("Productos.jsp").forward(request, response);
                    break;
                case "Ofertas":
                    request.getRequestDispatcher("RegistroUsuario.jsp").forward(request, response);
                    break;    
                default:
                    throw new AssertionError();
            }
                     
        }
    }

   


