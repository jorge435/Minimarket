$(document).ready(function () {
    $("tr #deleteItem").click(function (e) {
        e.preventDefault();
        var idp = $(this).parent().find('#idp1').val();        
        swal({
            title: "Esta Seguro de Eliminar?",
            text: "Una una Vez Eliminado, Debera Agregar de Nuevo!",
            icon: "warning",
            buttons: true,
            dangerMode: true
        }).then((willDelete) => {
            if (willDelete) {
                eliminar(idp);
                swal(" ¡Oh! ¡Registro Borrado! ", {
                    icon: "success",
                }).then((willDelete) => {
                    if (willDelete) {
                        parent.location.href = "Controlador?accion=carrito";
                    }
                });
            }
        });
    });
    function eliminar(idp) {
        var url = "Controlador?accion=delete" + idp;
        $.ajax({
            type: 'POST',
            url: url,
            async: true,
            success: function (r) {
            }
        });
    }

    $("tr #Cantidad").click(function () {
        var idp = $(this).parent().find('#idp').val();
        var cantidad = $(this).parent().find('#Cantidad').val();
        var url = "Controlador?accion=ActualizarCantidad";
        
        $.ajax({
            type: 'POST',
            url: url,
            data: "id=" + idp + "&Cantidad=" + cantidad,
            success: function (data, textStatus, jqXHR) {
                parent.location.href = "Controlador?accion=carrito";
            }
        });
    });    
   
});