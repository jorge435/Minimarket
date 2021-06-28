
package Usuario;

import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Conexion;

public class UsuarioValidar {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario Validar (String user, String pass){
        Usuario u = new Usuario();
        String sql = "select * from clientes where usuario=? and password=?";
        try{
               con=cn.Conexion();
               ps=con.prepareStatement(sql);
               ps.setString(1, user);
               ps.setString(2, pass);
               rs=ps.executeQuery();
               while(rs.next()){
                   
                   u.setUsuario(rs.getString("usuario"));
                   u.setPassword(rs.getString("password"));
                   u.setNombre(rs.getString("nombre"));
                   u.setApellidos(rs.getString("apellidos"));
               }
        }catch(Exception e){
            e.getMessage();
        }
        return u;
    }
    public Usuario ConseguirName(){
        Usuario u = new Usuario();
        String sql = "select * from clientes";
        try{
               con=cn.Conexion();
               ps=con.prepareStatement(sql);               
               rs=ps.executeQuery();
               while(rs.next()){
                   
                   u.setUsuario(rs.getString("usuario"));
                   u.setPassword(rs.getString("password"));
                   u.setNombre(rs.getString("nombre"));
                   u.setApellidos(rs.getString("apellidos"));
                   u.setEmail(rs.getString("email"));
                   u.setNum_doc(rs.getString("num_doc"));
                   u.setTelefono(rs.getString("telefono"));
                   u.setDireccion(rs.getString("direccion"));
               }
        }catch(Exception e){
            e.getMessage();
        }
        return u;
    }
    
    public List Buscar (String name){
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from clientes where id_cliente like '%"+name+"%' or nombre like '%"+name+"%' or apellidos like '%"+name+"%'";
        try{
         con=cn.Conexion();   
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
         while(rs.next()){  
                   Cliente u = new Cliente();
                   u.setId_cliente(rs.getInt("id_cliente"));
                   u.setApellidos(rs.getString("apellidos"));
                   u.setDireccion(rs.getString("direccion"));
                   u.setEmail(rs.getString("email"));
                   u.setNombre(rs.getString("nombre"));
                   u.setNum_doc(rs.getString("num_doc"));
                   u.setPassword(rs.getString("password"));
                   u.setTelefono(rs.getString("telefono"));
                   u.setUsuario(rs.getString("usuario"));
                   lista.add(u);                   
               }
        
        }catch(Exception e){
            e.getMessage();
        }
        return lista;
             
                  
    }
    
}
