
package Implements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.Producto;


public class ProductoMayorMenor {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    public List OrdenarMenor(){
        List<Producto> lista = new ArrayList<>();
        String sql = "select pr.id_producto, pr.descripcion, pr.imagen, pr.nombre, pr.precio, pr.stock \n" +
        "FROM producto pr\n" +
        "ORDER BY pr.precio ASC";
        try{
         con=cn.Conexion();   
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){  
                   Producto p = new Producto();
                   p.setIdproducto(rs.getInt("id_producto"));
                   p.setDescripcion(rs.getString("descripcion"));
                   p.setImagen(rs.getString("imagen"));
                   p.setNombre(rs.getString("nombre"));
                   p.setPrecio(rs.getDouble("precio"));
                   p.setStock(rs.getInt("stock"));
                   
                   lista.add(p);                   
               }
        
        }catch(Exception e){
            e.getMessage();
        }
        return lista;                               
    }
    
    public List OrdenarMayor(){
        List<Producto> lista = new ArrayList<>();
        String sql = "select pr.id_producto, pr.descripcion, pr.imagen, pr.nombre, pr.precio, pr.stock \n" +
        "FROM producto pr\n" +
        "ORDER BY pr.precio DESC";
        try{
         con=cn.Conexion();   
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){  
                   Producto p = new Producto();
                   p.setIdproducto(rs.getInt("id_producto"));
                   p.setDescripcion(rs.getString("descripcion"));
                   p.setImagen(rs.getString("imagen"));
                   p.setNombre(rs.getString("nombre"));
                   p.setPrecio(rs.getDouble("precio"));
                   p.setStock(rs.getInt("stock"));
                   
                   lista.add(p);                   
               }
        
        }catch(Exception e){
            e.getMessage();
        }
        return lista;                               
    }
    
}
