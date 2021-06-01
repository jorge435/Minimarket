
package modelo;

import java.util.List;

public class Compra {
    
    private int id_compra;
    private int id_cliente;
    private int id_pago;
    private String Estado;
    private String FechaCompra;
    private double monto;
    
    private List<Carrito> detallecompras;

    public Compra() {
    }

    public Compra( int id_cliente, int id_pago, String Estado, String FechaCompra, double monto, List<Carrito> detallecompras) {
        
        this.id_cliente = id_cliente;
        this.id_pago = id_pago;
        this.Estado = Estado;
        this.FechaCompra = FechaCompra;
        this.monto = monto;
        this.detallecompras = detallecompras;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public List<Carrito> getDetallecompras() {
        return detallecompras;
    }

    public void setDetallecompras(List<Carrito> detallecompras) {
        this.detallecompras = detallecompras;
    }
    
    
    
    
    

    
    
    
}
