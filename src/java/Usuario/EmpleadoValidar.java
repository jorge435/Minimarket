
package Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Conexion;

public class EmpleadoValidar {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado ValidarEmp (String user, String pass){
        Empleado em = new Empleado();
        String sql = "select * from empleado where usuario=? and password=?";
        try{
               con=cn.Conexion();
               ps=con.prepareStatement(sql);
               ps.setString(1, user);
               ps.setString(2, pass);
               rs=ps.executeQuery();
               while(rs.next()){
                   
                   em.setUsuario(rs.getString("usuario"));
                   em.setPassword(rs.getString("password"));
                   em.setNombre(rs.getString("nombre"));
                   em.setApellidos(rs.getString("apellidos"));
               }
        }catch(Exception e){
            e.getMessage();
        }
        return em;
    }
}
