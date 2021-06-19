
package Servicios;

public class ProductoService {

    public ProductoService() {
    }

    public String addproducto(java.lang.String descripcion, java.lang.String imagen, java.lang.String nombre, java.lang.String precio, java.lang.String stock, java.lang.String categoria) {
        webservices.Servidor_Service service = new webservices.Servidor_Service();
        webservices.Servidor port = service.getServidorPort();
        return port.addproducto(descripcion, imagen, nombre, precio, stock, categoria);
    }
    
    
    
}
