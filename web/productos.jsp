
<%@page import="modelo.Categoria"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
    </head>
    <body>
        
        <div class="container mt-4">
            <div class="d-flex">
                <h2>Productos</h2> 
                <a class="btn btn-outline-dark" style="margin-left: 950px; border: none" href="empmenu.jsp">Volver</a>                   
            </div>                    
            <div class="row">             
                <div class="col-lg-9">                 
                    <table class="table table-responsive">
                        <thead class="table-primary">
                            <tr class="text-center">                                                           
                                <th>Nombre</th>
                                <th>Imagen</th>
                                <th>Descripcion</th>
                                <th>Precio</th>
                                <th>Cantidad</th>                      
                                <th>Eliminar</th>                    
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="p" items="${producto2}" >
                                 <tr class="text-center tr">
                                                                      
                                    <td>${p.getNombre()} </td>                                    
                                    
                                    <td><img src="${p.getImagen()}" width="90" height="110"></td>
                                    <td>${p.getDescripcion()}</td>
                                    <td>S/.${p.getPrecio()}</td>
                                    <td>${p.getStock()}</td>
                                    <td class="text-center">                                         
                                        <input type="hidden" id="idp1" value="${c.getIdProduct()}">
                                        <a  href="Controlador?accion=Delete&idp=${c.getItem()}" id="btnDelete"><i class="fas fa-trash-alt"></i></a>
                                                                                
                                    </td>                                

                                </tr>
                            </c:forEach>
                       </tbody>
                    </table>                    
                </div>
                <div class="col-lg-3">                  
                    <div class="card">
                        <div class="card-header">
                            Registrar Producto
                        </div>
                        <div class="card-body">
                            <label>Nombre</label>
                            <input type="text" class="form-control text-center">
                            <label>Imagen</label>
                            <input type="text" class="form-control text-center">
                            <label>Descripcion</label>
                            <input type="text" class="form-control text-center">
                            <label>Precio</label>
                            <input type="text" class="form-control text-center">
                            <label>Cantidad</label>
                            <input type="text" class="form-control text-center">
                            <label>Categoria</label>
                            <select class="form-control" id="cboCategoriaProducto" name="cboCategoriaProducto">
                            
                            </select>
                            
                            </div>
                        <div class="card-footer">
                            <a href="Controlador?accion=GenerarCompra" class="btn btn-dark btn-block">Registrar</a>
                            <a href="#" class="btn btn-outline-dark btn-block">Editar</a>
                        </div>
                    </div>
                </div>
      
        
             </div>          
        </div>    
    </body>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.js"> </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"> </script>
    <script src="js/cantidad.js" type="text/javascript"></script>
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</html>
