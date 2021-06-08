
package Controlador;

import Implements.ProductoImpl;
import Servicios.ClienteService;
import Usuario.Empleado;
import Usuario.EmpleadoValidar;
import Usuario.UsuarioValidar;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import modelo.Producto;

public class ControladorEmp extends HttpServlet {
    
    //productos
    Producto p = new Producto();
    ProductoImpl pimpl = new ProductoImpl();
    List<Producto> producto = new ArrayList<>();
    
    List<Cliente> lista = new ArrayList<>();
    //listar cliente
    ClienteService cli = new ClienteService();
    
    //metodo buscar
    UsuarioValidar busca = new UsuarioValidar();
    
   
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        
        producto=pimpl.listarproductos();
        switch (accion) {         
                              
            case "ListarCliente":   
                
                request.getRequestDispatcher("listarcliente.jsp").forward(request, response);
                break;
            case "Delete":
                int id= Integer.parseInt(request.getParameter("id"));
                cli.eliminar(id);
                request.getRequestDispatcher("listarcliente.jsp").forward(request, response);
                break;  
            case "Buscar":
                String dato = request.getParameter("txtbuscar");
                List<Cliente> lista = busca.Buscar(dato);
                request.setAttribute("datos", lista); 
                request.getRequestDispatcher("listarcliente.jsp").forward(request, response);
                break;
                           
            default:            
                
                request.setAttribute("producto1", producto);                 
                request.getRequestDispatcher("empmenu.jsp").forward(request, response);
                    
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
