
package Servicios;


public class CategoriaServicios {

    public CategoriaServicios() {
    }

    public java.util.List<webservices.CategoriaRest> listarcategoria() {
        webservices.Servidor_Service service = new webservices.Servidor_Service();
        webservices.Servidor port = service.getServidorPort();
        return port.listarcategoria();
    }
    
    
    
}
