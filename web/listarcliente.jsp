<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="modelo.Conexion"%>
<%@page import="webservices.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="Servicios.ClienteService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Listar Cliente</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
               
                
                <div class="card-header">
                    <a class="btn btn-outline-danger" href="empmenu.jsp">Volver</a>  
                    <h2 class="text-center">Cliente</h2>
                </div>
                
                
                <form class="form" action="ControladorEmp">
                    <input type="search" name="txtbuscar" >
                    <input type="submit" name="accion" value="Buscar" class="btn btn-outline-dark">
                </form>
                
                
                    
                
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Cod_cliente</th>
                                <th>Apellidos</th>
                                <th>Direccion</th>
                                <th>Email</th>
                                <th>Nombre</th>
                                <th>DNI</th>
                                <th>Password</th>
                                <th>Telefono</th>
                                <th>Usuario</th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                        <%
                            ClienteService cli = new ClienteService();
                            List<Cliente> datos = cli.listar();
                            for(Cliente u:datos)
                            {                        
                            
                                                          
                            
                        %>                                              
                            <tr>
                                <td><%= u.getIdCliente()%></td>
                                <td><%= u.getApellidos()%></td>
                                <td><%= u.getDireccion()%></td>
                                <td><%= u.getEmail()%></td>
                                <td><%= u.getNombre()%></td>
                                <td><%= u.getNumDoc()%></td>
                                <td><%= u.getPassword()%></td>
                                <td><%= u.getTelefono()%></td>
                                <td><%= u.getUsuario()%></td>
                                
                      
                             
                                <td>
                                    <a href="ControladorEmp?accion=Editar&id=<%= u.getIdCliente()%>" class="btn btn-outline-dark">Editar</a>
                                    <a href="ControladorEmp?accion=Delete&id=<%= u.getIdCliente()%>" class="btn btn-outline-dark">Eliminar</a>
                                    
                                </td>
                                
                                <% }%>
                                
                            
                                
                </div>
                </div>
                
            </div>
        </div>
    </body>
</html>