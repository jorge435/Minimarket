$(document).ready(function(){
    $("body #btnDelete1").click(function (){
        var idp=$(this).parent().find("#idp11").val();
        pago1(idp);
        swal("Good job!", "You clicked the button!", "success")
        parent.location.href="Controlador?accion=carrito";
    });
    function pago1(idp) {
        var url="Controlador?accion=GenerarCompra";         
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp11="+idp,
            success: function (data, textStatus, jqXHR) {
               
            }
        });
    }
});


