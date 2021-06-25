
package Implements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Carrito;
import modelo.Compra;
import modelo.Conexion;

public class CompraImpl {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r= 0;
    
    public int GenerarCompra(Compra compra) {
        int idcompras;
        String sql= "insert into compras(estado,fecha_compra,monto,id_cliente,id_pago)values(?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, compra.getEstado());
            ps.setString(2, compra.getFechaCompra());
            ps.setDouble(3, compra.getMonto());
            ps.setInt(4, compra.getCliente().getId_cliente());            
            ps.setInt(5, compra.getId_pago());
            ps.executeUpdate();
            
            sql="Select @@IDENTITY AS id_compra";
            rs=ps.executeQuery(sql);
            rs.next();
            idcompras=rs.getInt("id_compra");
            rs.close();
            
            for(Carrito detalle : compra.getDetallecompras()){
                sql="insert into detalle_compra(cantidad,preciocompra,id_compra,id_producto)values(?,?,?,?)";
                ps=con.prepareStatement(sql);
                ps.setInt(1, detalle.getCantidad());
                ps.setDouble(2, detalle.getPrecioCompra());
                ps.setInt(3, idcompras);
                ps.setInt(4, detalle.getIdProduct());             
                                
                r=ps.executeUpdate();
            }
            
        } catch (Exception ex1) {
            ex1.getMessage();
        }
        return r;
    }
    
    
}
