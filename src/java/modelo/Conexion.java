
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    //private static String bd ="bd_minimarket";
    private static String user ="root";
    private static String pass = "12345";
    private static String url= "jdbc:mysql://localhost:3306/bd_minimarket?characterEncoding=latin1";
    
    
    public Connection Conexion(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(url,user,pass);
            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error en conexion"+ex.getMessage());
        }
        return cn;
    }
}
