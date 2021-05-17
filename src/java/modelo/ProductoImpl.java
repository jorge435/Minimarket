
package modelo;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;


public class ProductoImpl {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Producto listarId(int id) {
        Producto p = new Producto();
        String sql1 = "select * from producto where id_producto=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql1);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setIdproducto(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setImagen(rs.getString(3));                               
                p.setNombre(rs.getString(4));
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
    
    
    public void listarImg(int id, HttpServletResponse response){
        String sql = "select * from producto where id_producto="+id;
        InputStream inputStream=null;
        OutputStream outputStream=null;
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        
        try{
            outputStream=response.getOutputStream();
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                inputStream=rs.getBinaryStream("imagen");
            }
            bufferedInputStream= new BufferedInputStream(inputStream);
            bufferedOutputStream= new BufferedOutputStream(outputStream);
            int i=0;
             while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        
    }
    
}
