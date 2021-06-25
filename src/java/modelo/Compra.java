
package modelo;

import java.util.List;

public class Compra {
    
    private int id_compra;
    private Cliente cliente;
    private int id_pago;
    private String Estado;
    private String FechaCompra;
    private Double monto;
    
    private List<Carrito> detallecompras;

    public Compra() {
    }

    public Compra( Cliente cliente, int id_pago, String Estado, String FechaCompra, Double monto, List<Carrito> detallecompras) {
        
        this.cliente = cliente;
        this.id_pago = id_pago;
        this.Estado = Estado;
        this.FechaCompra = FechaCompra;
        this.monto = monto;
        this.detallecompras = detallecompras;
    }

   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public List<Carrito> getDetallecompras() {
        return detallecompras;
    }

    public void setDetallecompras(List<Carrito> detallecompras) {
        this.detallecompras = detallecompras;
    }

    
    
    
    
    

    
    
    
}
