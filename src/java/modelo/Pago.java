
package modelo;

public class Pago {
    
    private int id_pago;
    private double monto;

    public Pago() {
    }

    public Pago(int id_pago, double monto) {
        this.id_pago = id_pago;
        this.monto = monto;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
}
