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
                    <a class="btn btn-outline-danger" href="listarcliente.jsp">Volver</a>                   
                </div>               
                            
                    
                
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
                                
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="p" items="${datos}" >                                             
                            <tr>
                                <td>${p.getId_cliente()}</td>
                                <td>${p.getApellidos()}</td>
                                <td>${p.getDireccion()}</td>
                                <td>${p.getEmail()}</td>
                                <td>${p.getNombre()}</td>
                                <td>${p.getNum_doc()}</td>
                                <td>${p.getPassword()}</td>
                                <td>${p.getTelefono()}</td>
                                <td>${p.getUsuario()}</td>                      
                                                         
                                
                        </c:forEach>      
                                
                </div>
                </div>
                
            </div>
        </div>
    </body>
</html>