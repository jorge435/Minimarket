
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
