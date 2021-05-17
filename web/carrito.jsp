
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
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">MiniMarket Express</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Controlador?accion=home">Home<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" href="Controlador?accion=Ofertas">Ofertas del Dia</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link active" href="Controlador?accion=home" tabindex="-1" aria-disabled="true">+ Compras</a>         
           
        </li>
        
       </ul>
        
            
       <div class="dropdown me-3">
        <button class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
          ${cliente.getNombre()}
        </button>
        <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
          <a class="dropdown-item" href="#">${cliente.getUsuario()}</a>
          <a class="dropdown-item" href="#">${cliente.getApellidos()}</a>
          <a class="dropdown-item" href="login.jsp">Salir</a>
        </div>
      </div>            
              
       
    </div>
  </div>
</nav>
          
          
<div class="container mt-4">
            <div class="d-flex">
                <h2>Carrito</h2>                       
            </div>                    
            <div class="row">             
                <div class="col-lg-9">                 
                    <table class="table table-responsive">
                        <thead class="table-primary">
                            <tr class="text-center">
                                <th>Item</th>                               
                                <th>Articulo</th>
                                <th>Descripcion</th>
                                <th>Precio</th>
                                <th>Cantidad</th>                       
                                <th>Total</th>                       
                                <th>Acciones</th>                       
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="c" items="${Carrito}" varStatus="iterator"> 
                                <tr class="text-center tr">
                                    <td>${iterator.index+1}</td>                                   
                                    <td>${c.getNombres()}
                                        <img src="${c.getImagen()}" width="130" height="110">
                                    </td>
                                    <td>${c.getDescripcion()}</td>
                                    <td>${c.getPrecioCompra()}</td>
                                    <td>        
                                        <input type="hidden" id="item1" value="${c.getIdProducto()}">
                                        <input type="number" min="1" max="10"  id="Cant" class=" form-control text-center" value="${c.getCantidad()}">
                                    </td>   
                                    <td>${c.getSubTotal()}</td>                           
                                    <td class="text-center">                                         
                                        <input type="hidden" id="item2" value="${c.getIdProducto()}">
                                        <a id="deleteItem" href="#" class="btn-outline-danger btn-sm"><i class="fas fa-trash-alt"></i></a>                                            
                                    </td>                           
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>                    
                </div>
                <div class="col-lg-3">                  
                    <div class="card">
                        <div class="card-header">
                            Generar Compra
                        </div>
                        <div class="card-body">
                            <label>Subtotal:</label>
                            <a class="form-control text-center"><i class="fas fa-dollar-sign h5"> ${totalPagar}0</i></a>
                            <label>Precio Envio:</label>
                            <a class="form-control text-center"><i class="fas fa-dollar-sign h5"> 0.00</i></a>
                            <label>Descuento:</label>
                            <a class="form-control text-center"><i class="fas fa-dollar-sign h5"> 0.00</i></a>
                            <label>Total a Pagar:</label>
                            <a class="form-control text-center"><i class="fas fa-dollar-sign h4 primary"> ${totalPagar}0</i></a>
                        </div>
                        <div class="card-footer">
                            <a href="Controlador?accion=GenerarCompra" class="btn btn-dark btn-block">Generar Compra</a>
                            <a href="#" class="btn btn-dark btn-block">Realizar Pago</a>
                        </div>
                    </div>
                </div>
            </div>          
        </div>      
          
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</html>
