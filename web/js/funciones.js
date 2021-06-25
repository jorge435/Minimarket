$(document).ready(function(){
    $("tr #btnDelete").click(function (){
        var idp=$(this).parent().find("#idp1").val();
        swal({
            title: "Eliminar Producto?",
            text: "Eliminar Producto del Carrito de Compras",
            icon: "warning",
            buttons: true,
            dangerMode: true,
          })
          .then((willDelete) => {
            if (willDelete) {
                eliminar(idp);
              swal("Producto eliminado del carrito Correctamente!", {
                icon: "success",
              }).then((willDelete) => {
                  if (willDelete) {
                      parent.location.href="Controlador?accion=carrito";
                  }                  
              });
            } else {
              swal("No se elimino producto");
            }
          });
        eliminar(idp);
    });
    function eliminar(idp) {
        var url="Controlador?accion=Delete2";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp1="+idp,
            success: function (data, textStatus, jqXHR) {
               
            }
        });
    }
});
