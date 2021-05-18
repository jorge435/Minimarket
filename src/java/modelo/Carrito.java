
package modelo;

public class Carrito {
    private int item;
    private int idProduct;
    private String nom;
    private String imag;
    private String descrip;
    private double precioCompra;
    private int cantidad;
    private double subTotal;

    public Carrito() {
    }

    public Carrito(int item, int idProduct, String nom, String imag, String descrip, double precioCompra, int cantidad, double subTotal) {
        this.item = item;
        this.idProduct = idProduct;
        this.nom = nom;
        this.imag = imag;
        this.descrip = descrip;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    
    

    
    
    
}
