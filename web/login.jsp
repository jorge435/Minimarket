
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Mini-Market Express</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <div class="title"><h1>LOGIN MINIMARKET EXPRESS</h1></div>
	<div class="container">
		<div class="left">
			
		</div>
		
		<div class="right">
			<div class="box">
				<center>
                                    <form action="ValidarUsuario" method="post">					
					<p>Username</p>
					<input type="text" name="txtuser" placeholder="Enter your Username">
					<p>Password</p>
					<input type="password" name="txtpass" placeholder="********">
					<br>
					<input type="submit" name="accion" value="Ingresar">
					<br>		
								
				    </form>
                                    <a href="RegistroUsuario.jsp">Registrar</a>
				<center>
			</div>
		</div>
		
	</div>
    </body>
</html>
