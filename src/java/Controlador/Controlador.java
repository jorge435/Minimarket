
package Controlador;

import Implements.CompraImpl;
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
import Implements.ProductoMayorMenor;
import modelo.Cliente;
import modelo.Compra;
import modelo.Fecha;
import modelo.Pago;


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
    
    //busqueda producto
    ProductoImpl buscarproducto= new ProductoImpl();
    
    //ODENAR MAYOR A MENOR
    ProductoMayorMenor meyormenor= new ProductoMayorMenor();
    
    

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
                        
                case "Buscar":
                String dato = request.getParameter("txtbuscar");
                List<Producto> lista  = buscarproducto.Buscar(dato);
                request.setAttribute("producto", lista); 
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
                
                case "Bebidas":
                List<Producto> lista1  = buscarproducto.CategoriaBebidas();
                request.setAttribute("producto", lista1); 
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break; 
                
                case "Aceites":
                List<Producto> lista2  = buscarproducto.CategoriaAceites();
                request.setAttribute("producto", lista2); 
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break; 
                
                case "Lacteos":
                List<Producto> lista3  = buscarproducto.CategoriaLacteos();
                request.setAttribute("producto", lista3); 
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
                
                case "Menor":
                List<Producto> lista4  = meyormenor.OrdenarMenor();
                request.setAttribute("producto", lista4); 
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
                
                case "Mayor":
                List<Producto> lista5 = meyormenor.OrdenarMayor();
                request.setAttribute("producto", lista5); 
                request.getRequestDispatcher("menu.jsp").forward(request, response);
                break;
                
                case "Delete2":
                int idproducto2= Integer.parseInt(request.getParameter("idp1"));
                for (int i = 0; i <listacarrito.size(); i++) {
                              if(listacarrito.get(i).getIdProduct()==idproducto2){
                                    listacarrito.remove(i);
                              }
                        }   
                break;
                
                case "GenerarCompra":
                Cliente cliente = new Cliente();
                cliente.setId_cliente(1);
                //Pago pago = new Pago();
                CompraImpl compradao= new CompraImpl();
                Compra compra = new Compra(cliente,1, "cancelado",Fecha.FechaBD(), totalPagar, listacarrito);
                int res=compradao.GenerarCompra(compra);
                if(res!=0&&totalPagar>0){
                    request.getRequestDispatcher("mensaje.jsp").forward(request, response);
                }else{
                    request.getRequestDispatcher("mensaje.jsp").forward(request, response);
                }
                break;
                        
                default:
                    request.setAttribute("producto", producto);                 
                    request.getRequestDispatcher("menu.jsp").forward(request, response);    
                        
                    
            }
                     
        }
    
    


    
    
    }



   


