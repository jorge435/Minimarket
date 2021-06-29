

<%@page import="webservices.Cliente"%>
<%@page import="Servicios.ClienteService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <title>Editar Cliente</title>
    </head>
    <body>
        
       
        <div class="col-mb-3" style="margin-left:500px;margin-top: 5px; width: 600px">    
            <div class="card-header">
                    <a class="btn btn-outlin-dark" href="listarcliente.jsp">Volver</a>                   
        </div>
                    <div class="card">
                        <div class="card-header">
                            Editar Cliente
                            
                            <%
                            int idcliente =Integer.parseInt((String)request.getAttribute("iduser"));
                            ClienteService cli = new ClienteService();
                            Cliente c = cli.listarid(idcliente);
                            %>
                        </div>
                        <div class="card-body">
                            <div class="col-md-6">
                                <label class="form-label">Idcliente</label>
                                <input type="text" name="txtid"  readonly="true" value="<%=c.getIdCliente()%>" class="input">
                            </div>
                            <div class="row g-3">
                            <div class="col-md-6">
                                <label  class="form-label">Nombre</label>
                                <input type="text" readonly="true" value="<%=c.getNombre()%>" class="form-control" >
                            </div>
                            <div class="col-md-6">
                                <label  class="form-label">Apellidos</label>
                                <input type="text"  readonly="true" value="<%=c.getApellidos()%>"class="form-control" >
                            </div>    
                            </div> 
                            <label>Correo</label>
                            <input type="text"  name="txtcorreo" value="<%=c.getEmail()%>" class="form-control text-center">
                            <div class="row g-3">
                            <div class="col-md-6">
                                <label  class="form-label">Numero de Documento</label>
                                <input type="text" readonly="true" value="<%=c.getNumDoc()%>" class="form-control" >
                            </div>
                            <div class="col-md-6">
                                <label class="form-label">Direccion</label>
                                <input type="text" readonly="true" value="<%=c.getDireccion()%>"class="form-control" >
                            </div>    
                            </div>                             
                            <label>Password</label>
                            <input type="text"  name="txtpass" value="<%=c.getPassword()%>" class="form-control text-center">
                            <label>Telefono</label>
                            <input type="text"   value="<%=c.getTelefono()%>" name="txttele"  class="form-control text-center">
                            <div class="row g-3">
                            <div class="col-md-6">
                                <label  class="form-label">Usuario</label>
                                <input type="text"  name="txtusu" value="<%=c.getUsuario()%>" class="form-control" >
                            </div>                               
                            </div>                          
                                                                                   
                            </div>                                                      
                            <div class="card-footer">
                                <script>
                                    function editar(){
                                        var idp=$(this).parent().find("#edt").val();
                                        swal("Actualizar!", "Actualizado con Exitoso!", "success")
                                        //parent.location.href="Controlador?accion=carrito";                                        
                                        pago2020(idp);
                                  }
                                  function pago2020(idp) {
                                            var url="ControladorEmp?accion=Actualizar?id=<%=c.getIdCliente()%>";
                                            $.ajax({
                                                type: 'POST',
                                                url: url,
                                                data: "idp1="+idp,
                                                success: function (data, textStatus, jqXHR) {

                                   }
                                 });
                               }
                                </script>                            
                                <a href="#"  onclick="editar()" class="btn btn-dark btn-block">Actualizar</a>
                            <a href="ControladorEmp?accion=home1" class="btn btn-outline-dark btn-block">Cancelar</a>
                            
                            
                        </div>
                        </div> 
                             
        </div>                
       
    </body>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</html>
