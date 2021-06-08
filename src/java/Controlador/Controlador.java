
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
import Implements.ProductoImpl;


public class Controlador extends HttpServlet {
    Producto p = new Producto();
    ProductoImpl pimpl = new ProductoImpl();
    List<Producto> producto = new ArrayList<>();
    
    
    //listar carrito
    List<Carrito> listacarrito = new ArrayList<>();
    int item;
    int cantidad = 1;
    double subtotal = 0.0;
    double totalPagar = 0.0;
    //globales variables 
    int idp;
    Carrito cu;
    

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
            String accion = request.getParameter("accion");
            producto=pimpl.listarproductos();
            switch (accion) {                
                case "Comprar":
                    totalPagar = 0.0;
                    idp = Integer.parseInt(request.getParameter("id"));
                    p=pimpl.listarId(idp);
                    item=item+1;
                    String name = p.getNombre();
                    //use variable global
                    cu = new Carrito();
                    //lista
                    cu.setItem(item);
                    cu.setIdProduct(p.getIdproducto());
                    cu.setNom(p.getNombre());
                    cu.setImag(p.getImagen());
                    cu.setDescrip(p.getDescripcion());
                    cu.setPrecioCompra(p.getPrecio());
                    cu.setCantidad(cantidad);
                    cu.setSubTotal(cantidad*p.getPrecio());
                    listacarrito.add(cu);    
                    for (int i = 0; i < listacarrito.size(); i++) {
                    totalPagar = totalPagar + listacarrito.get(i).getSubTotal();
                    }
                    request.setAttribute("totalpago", totalPagar);
                    request.setAttribute("car", listacarrito) ; 
                    request.setAttribute("cont", listacarrito.size());
                    request.getRequestDispatcher("carrito.jsp").forward(request, response);
                    break;
                case "AgregarCarrito":
                    //agregando cantidad
                    int pos = 0;
                    cantidad = 1;
                    idp = Integer.parseInt(request.getParameter("id"));
                    p=pimpl.listarId(idp);
                    
                    if(listacarrito.size()>0){
                        for (int i = 0; i < listacarrito.size(); i++) {
                            if(idp==listacarrito.get(i).getIdProduct()){
                                pos=i;
                            }
                        }
                        if(idp==listacarrito.get(pos).getIdProduct()){
                            cantidad=listacarrito.get(pos).getCantidad()+cantidad;
                            double subtotal = listacarrito.get(pos).getPrecioCompra()*cantidad;
                            listacarrito.get(pos).setCantidad(cantidad);
                            listacarrito.get(pos).setSubTotal(subtotal);
                        }
                        else{
                            item=item+1;                    
                            cu = new Carrito();
                            cu.setItem(item);
                            cu.setIdProduct(p.getIdproducto());
                            cu.setNom(p.getNombre());
                            cu.setImag(p.getImagen());
                            cu.setDescrip(p.getDescripcion());
                            cu.setPrecioCompra(p.getPrecio());
                            cu.setCantidad(cantidad);
                            cu.setSubTotal(cantidad*p.getPrecio());
                            listacarrito.add(cu);
                        }
                    }else{
                    item=item+1;                    
                    cu = new Carrito();
                    cu.setItem(item);
                    cu.setIdProduct(p.getIdproducto());
                    cu.setNom(p.getNombre());
                    cu.setImag(p.getImagen());
                    cu.setDescrip(p.getDescripcion());
                    cu.setPrecioCompra(p.getPrecio());
                    cu.setCantidad(cantidad);
                    cu.setSubTotal(cantidad*p.getPrecio());
                    listacarrito.add(cu);
                    }                                 
                                          
                    request.setAttribute("cont", listacarrito.size());
                    request.getRequestDispatcher("Controlador?accion=home").forward(request, response);
                    break;
                case "ActualizarCantidad":
                    int idpro = Integer.parseInt(request.getParameter("id"));
                    int cant= Integer.parseInt(request.getParameter("Cantidad"));
                    for (int i = 0; i < listacarrito.size(); i++) {
                        if(listacarrito.get(i).getIdProduct()==idpro){
                            listacarrito.get(i).setCantidad(cant);
                            listacarrito.get(i).setSubTotal(listacarrito.get(i).getPrecioCompra() * cant);
                        }
                    }
                    request.getRequestDispatcher("Controlador?accion=carrito").forward(request, response);                  
                    break;    
                case "carrito":
                    totalPagar = 0.0;
                    request.setAttribute("car", listacarrito) ; 
                    for (int i = 0; i < listacarrito.size(); i++) {
                    totalPagar = totalPagar + listacarrito.get(i).getSubTotal();
                    }
                    request.setAttribute("totalpago", totalPagar);
                    request.getRequestDispatcher("carrito.jsp").forward(request, response);
                    break;  
                case "Delete":
                     int idproducto=Integer.parseInt(request.getParameter("idp"));
                        for (int i = 0; i <listacarrito.size(); i++) {
                              if(listacarrito.get(i).getItem()==idproducto){
                                    listacarrito.remove(i);
                              }
                        }                        
                        request.getRequestDispatcher("Controlador?accion=carrito").forward(request, response);
                        break;                
                default:
                    request.setAttribute("producto", producto);                 
                    request.getRequestDispatcher("menu.jsp").forward(request, response);    
                        
                    
            }
                     
        }
    
    


    
    
    }



   


