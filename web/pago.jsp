

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <title>Pago</title>
        <link href="css/pago.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>       
        <div class="col-mb-3" style="margin-left:500px;margin-top: 5px; width: 600px">                  
                    <div class="card">
                        <div class="card-header">
                            Realizar Pago de Productos
                        </div>
                        <div class="card-body">
                            <div class="row g-3">
                            <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">Nombre</label>
                                <input type="text" readonly="true" value="${clientepago.getNombre()}" class="form-control" id="inputPassword4">
                            </div>
                            <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">Apellidos</label>
                                <input type="text"  readonly="true" value="${clientepago.getApellidos()}"class="form-control" id="inputPassword4">
                            </div>    
                            </div> 
                            <label>Correo</label>
                            <input type="text" readonly="true" name="txtdesp" value="${clientepago.getEmail()}" class="form-control text-center">
                            <div class="row g-3">
                            <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">Numero de Documento</label>
                                <input type="text" readonly="true" value="${clientepago.getNum_doc()}" class="form-control" id="inputPassword4">
                            </div>
                            <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">Telefono</label>
                                <input type="text"  readonly="true" value="${clientepago.getTelefono()}"class="form-control" id="inputPassword4">
                            </div>    
                            </div>                             
                            <label>Direccion</label>
                            <input type="text" readonly="true" name="txtcanti" value="${clientepago.getDireccion()}" class="form-control text-center">
                            <label>Total a Pagar</label>
                            <input type="text" readonly="true" value="${totalpago}" name="txtcanti"  class="form-control text-center">
                            <label>Nombre de Tarjeta</label>
                            <select  name="categoria" class="form-control text-center"> 
                            
                            <option value="">Scotiabank</option>
                            <option value="">BBVA</option>
                            <option value="">BCP</option>
                            </select>
                            <label>Numero de Tarjeta</label>
                            <input type="text"  value="" name="txtcanti" class="form-control text-center">
                            <div class="row g-3">
                            <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">Fecha de Expiracion</label>
                                <input type="text"  class="form-control" id="inputPassword4">
                            </div>
                            <div class="col-md-6">
                                <label for="inputPassword4" class="form-label">CVC</label>
                                <input type="text" class="form-control" id="inputPassword4">
                            </div>    
                            </div>
                            
                            
                            
                            </div>
                            <div class="card-footer">
                            <img src="img/visa.png" width="100px"/>
                            <img src="img/master.png" width="100px"/>
                            </div>                            
                            <div class="card-footer">
                                <script>
                                    function pago(){
                                        var idp=$(this).parent().find("#pagar").val();
                                        swal("Pago Realizado!", "Transaccion Exitosa!", "success")
                                        //parent.location.href="Controlador?accion=carrito";                                        
                                        pago2020(idp);
                                  }
                                  function pago2020(idp) {
                                            var url="Controlador?accion=GenerarCompra";
                                            $.ajax({
                                                type: 'POST',
                                                url: url,
                                                data: "idp1="+idp,
                                                success: function (data, textStatus, jqXHR) {

                                   }
                                 });
    }
                                </script>                            
                                <a href="#"  id="pagar" onclick="pago();" class="btn btn-dark btn-block">Realizar Pago</a>
                            <a href="Controlador?accion=home" class="btn btn-outline-dark btn-block">Cancelar</a>
                            
                            
                        </div>
                        </div> 
                             
        </div>                             
                          
    </body>
    <script src="js/pago.js" type="text/javascript"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</html>
