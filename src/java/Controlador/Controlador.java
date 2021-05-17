
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Carrito;
import modelo.Producto;
import modelo.ProductoImpl;


public class Controlador extends HttpServlet {
    Producto p = new Producto();
    ProductoImpl pimpl = new ProductoImpl();
    List<Producto> producto = new ArrayList<>();
    
    
    //listar carrito
    List<Carrito> listaCarrito = new ArrayList<>();
    int item;
    int cantidad = 1;
    double subtotal = 0.0;
    double totalPagar = 0.0;
    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
            String accion = request.getParameter("accion");
            producto=pimpl.listarproductos();
            switch (accion) {
                case "Principal":                                                  
                    request.getRequestDispatcher("Controlador?accion=home").forward(request, response);
                    break;
                case "AgregarCarrito":
                    int idp = Integer.parseInt(request.getParameter("id"));
                    p=pimpl.listarId(idp);
                    item=item+1;
                    Carrito cu = new Carrito();
                    cu.setItem(item);
                    cu.setIdProduct(p.getIdproducto());
                    cu.setNombres(p.getNombre());
                    cu.setDescripcion(p.getDescripcion());
                    cu.setPrecioCompra(p.getPrecio());
                    cu.setCantidad(cantidad);
                    cu.setSubTotal(cantidad*p.getPrecio());
                    listaCarrito.add(cu);    
                    request.setAttribute("cont", listaCarrito.size());
                    request.getRequestDispatcher("Controlador?accion=home").forward(request, response);
                    break;
                case "Carrito":
                    totalPagar=0.0;
                    request.setAttribute("carrito", listaCarrito);
                    request.getRequestDispatcher("carrito.jsp").forward(request, response);
                    break;      
                default:
                    request.setAttribute("producto", producto);                 
                    request.getRequestDispatcher("menu.jsp").forward(request, response);
                    
            }
                     
        }
    }

   


