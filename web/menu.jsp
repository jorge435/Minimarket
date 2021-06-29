<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <title>Menu Minimarket</title>
    </head>
    <body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="Controlador?accion=home">
        <img src="img/mini1.png" style="height: 80px; width: 200px; background: white"/></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
      <div class="dropdown me-3" style="margin-left:20px;">
        <button  style="border: none; font-size: 1.3em;"class="btn btn-outline-light   dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
             Categorias
        </button>
      <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
      <form class="d-flex" action="Controlador" style="margin-left:20px; ">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Bebidas" style="background: white; color: black; border: none" >
            <i class="fas fa-wine-bottle" style="margin-right:10px"></i>Bebidas</button>
      </form>
      <div class="dropdown-divider"></div>      
      <form class="d-flex" action="Controlador" style="margin-left:20px;">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Aceites" style="background: white; color: black; border: none" >
            <i class="fas fa-oil-can" style="margin-right:10px"></i>Aceites</button>
      </form>  
      <div class="dropdown-divider"></div>
      <form class="d-flex" action="Controlador" style="margin-left:20px; ">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Arroz" style="background: white; color: black; border: none" >
            <i class="fas fa-seedling" style="margin-right:10px"></i>Arroz</button>
      </form> 
      <div class="dropdown-divider"></div>
      <form class="d-flex" action="Controlador" style="margin-left:20px; ">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Menestras" style="background: white; color: black; border: none" >
            <i class="fas fa-leaf" style="margin-right:10px"></i> Menestras</button>
      </form>  
      <div class="dropdown-divider"></div>
      <form class="d-flex" action="Controlador" style="margin-left:20px; ">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Yogurts" style="background: white; color: black; border: none" >
            <i class="fas fa-prescription-bottle" style="margin-right:10px"></i>Yogurts</button>
      </form> 
      <div class="dropdown-divider"></div>
      <form class="d-flex" action="Controlador" style="margin-left:20px;">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Abarrotes" style="background: white; color: black; border: none" >
            <i class="fas fa-shopping-basket"  style="margin-right:10px"></i> Abarrotes</button>
      </form>  
      <div class="dropdown-divider"></div>
      <form class="d-flex" action="Controlador" style="margin-left:20px; ">        
        <button class="btn btn-outline-dark" type="submit" name="accion" value="Licores" style="background: white; color: black; border: none" >
            <i class="fas fa-glass-martini-alt" style="margin-right:10px"></i>Licores</button>
      </form> 
     </div>
          
      </div>
        </li>
       
       </ul>
        
       <form class="d-flex" style="margin-right: 120px; width: 770px ; height: 60px; border-radius: 20px" action="Controlador">
        <input class="form-control me-1" type="search"  name="txtbuscar" placeholder="Buscar Productos" aria-label="Search">
        <button class="btn btn-outline-light" type="submit" name="accion" value="Buscar" style="border: none"><i class="fab fa-searchengin"></i></button>
        </form>
        
        <li class="d-flex" style="margin-right:10px" >
          <a class="nav-link active" href="Controlador?accion=carrito" tabindex="-1" aria-disabled="true">
              <i style="color: white" class="fas fa-cart-plus">(<label style="color: #e65c00">${cont}</label>)</i>
           </a>
        </li>
        
        
       <div class="dropdown me-3 dropstart" style="margin-left:1px" >
        <button  style="border: none"
                 class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
          ${cliente.getNombre()}
        </button>
        <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
          <a class="dropdown-item" href="#">${cliente.getUsuario()}</a>
          <a class="dropdown-item" href="#">${cliente.getApellidos()}</a>
          <a class="dropdown-item" href="login.jsp" >Cerrar Sesión</a>
        </div>
      </div>            
              
       
    </div>
  </div>

</nav>   
    <nav class="navbar navbar-expand-lg navbar-dark bg-light">       
               
      <div class="dropdown me-3" style="margin-left:1300px;">
        <button class="btn btn-outline-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
          Ordenar Por
        </button>
        <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
          <form class="d-flex" action="Controlador" style="margin-left:20px;">
          <button style="border: none"class="btn btn-outline-dark" type="submit" name="accion" value="Menor">Menor Precio</button>
          </form> 
          <form class="d-flex" action="Controlador" style="margin-left:20px; border: none">
          <button style="border: none" class="btn btn-outline-dark" type="submit" name="accion" value="Mayor">Mayor Precio</button>
          </form> 
        </div>
      </div>  
    </nav>    
          
     
     <div class="container mt-4">
            <div class="row">                
                <c:forEach var="p" items="${producto}" >
                    <div class="col-sm-3 " style="margin-bottom: 20px;">
                    <div class="card">
                        <div class="card-header">
                            <h4>${p.getNombre()}</h4>                            
                        </div>
                        <div class="card-body text-center">                            
                            <img src="${p.getImagen()}" width="200" height="180">  
                            
                        </div>
                        <div class="card-footer text-center">
                             <i>S/. ${p.getPrecio()}</i>
                             
                             <br>
                            <label>${p.getDescripcion()}</label>
                            <div class=" col-lg-12 text-center">
                                <a href="Controlador?accion=AgregarCarrito&id=${p.getIdproducto()}" class="btn btn-outline-dark">Agregar a Carrito</a>
                                
                                <a href="Controlador?accion=Comprar&id=${p.getIdproducto()}" class="btn btn-outline-dark">Comprar</a>
                            </div>
                        </div>                              
                    </div>
                </div>  
                
              </c:forEach>  
                    
            </div>
        </div>
         
 
    </body>
    <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</html>
