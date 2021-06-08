
package Servicios;

import webservices.Cliente;

public class ClienteService {

    public ClienteService() {
    }
    
    
    public java.util.List<webservices.Cliente> listar() {
        webservices.Servidor_Service service = new webservices.Servidor_Service();
        webservices.Servidor port = service.getServidorPort();
        return port.listar();
    }

    public String add(java.lang.String apellidos, java.lang.String direccion, java.lang.String email, java.lang.String nombre, java.lang.String numDoc, java.lang.String password, java.lang.String telefono, java.lang.String usuario) {
        webservices.Servidor_Service service = new webservices.Servidor_Service();
        webservices.Servidor port = service.getServidorPort();
        return port.add(apellidos, direccion, email, nombre, numDoc, password, telefono, usuario);
    }

    public Cliente eliminar(int id) {
        webservices.Servidor_Service service = new webservices.Servidor_Service();
        webservices.Servidor port = service.getServidorPort();
        return port.eliminar(id);
    }

    public Cliente listarid(int id) {
        webservices.Servidor_Service service = new webservices.Servidor_Service();
        webservices.Servidor port = service.getServidorPort();
        return port.listarid(id);
    }
    
    
    
}
