
package Implements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.Categoria; 


public class CategoriaImpl {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List listarcategorias(){
        List<Categoria> categorias = new ArrayList();
        String sql="select * from categoria";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Categoria p = new Categoria();
                p.setIdcategoria(rs.getInt("id_categoria"));
                p.setNombre(rs.getString("nombre"));                               
                categorias.add(p);
            }
            
        }catch(Exception e){
            e.getMessage();
        }      
        
        
        return categorias;
    }
}
