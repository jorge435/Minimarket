

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <title>Menu Minimarket</title>
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
          <a class="nav-link active" aria-current="page" href="Controlador?accion=Producto" target="looper">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" href="Controlador?accion=Ofertas" target="looper">Ofertas del Dia</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link active" href="#" tabindex="-1" aria-disabled="true">Carrito de Compras</a>
        </li>
        
       </ul>
        
       <form class="d-flex">
        <input class="form-control me-1" type="search" placeholder="Search" aria-label="Search">
        <%--button class="btn btn-outline-light" type="submit">Buscar</button--%>
       </form>
        
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
        
  
          
          
 <div class="m-4" style="height: 600px;">
       <iframe name="looper" style="height: 100%; width: 100%;"></iframe>            
 </div>  
          
          
    </body>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</html>
