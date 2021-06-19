
package Implements;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.Producto;


public class ProductoImpl {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Producto listarId(int id) {
        Producto p = new Producto();
        String sql= "select * from producto where id_producto="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setIdproducto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setImagen(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getDouble(5));
                p.setStock(rs.getInt(6));
            }
        } catch (Exception ex1) {
            ex1.getMessage();
        }
        return p;
    }

    
    public List listarproductos(){
        List<Producto>productos = new ArrayList();
        String sql="select * from producto";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setIdproducto(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setImagen(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setPrecio(rs.getDouble(5));
                p.setStock(rs.getInt(6));
                
                productos.add(p);
            }
            
        }catch(Exception e){
            e.getMessage();
        }      
        
        
        return productos;
    }
    
    public List Buscar (String name){
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto where id_producto like '%"+name+"%' or nombre like '%"+name+"%'";
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
    
    public List CategoriaBebidas (){
        List<Producto> lista = new ArrayList<>();
        String sql = "select pr.id_producto, pr.descripcion, pr.imagen, pr.nombre, pr.precio, pr.stock \n" +
        "FROM producto pr\n" +
        "inner join categoria cate ON pr.id_categoria = cate.id_categoria\n" +
        "WHERE cate.nombre = 'bebidas'\n" +
        "ORDER BY id_producto DESC";
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
    
    
    public List CategoriaAceites(){
        List<Producto> lista = new ArrayList<>();
        String sql = "select pr.id_producto, pr.descripcion, pr.imagen, pr.nombre, pr.precio, pr.stock \n" +
        "FROM producto pr\n" +
        "inner join categoria cate ON pr.id_categoria = cate.id_categoria\n" +
        "WHERE cate.nombre = 'Aceites'\n" +
        "ORDER BY id_producto DESC";
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
    
    
    public List CategoriaLacteos(){
        List<Producto> lista = new ArrayList<>();
        String sql = "select pr.id_producto, pr.descripcion, pr.imagen, pr.nombre, pr.precio, pr.stock \n" +
        "FROM producto pr\n" +
        "inner join categoria cate ON pr.id_categoria = cate.id_categoria\n" +
        "WHERE cate.nombre = 'lacteos'\n" +
        "ORDER BY id_producto DESC";
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
