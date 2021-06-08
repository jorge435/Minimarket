
package Usuario;

public class Empleado {
    
     private int id_empleado;

    private String nombre;

    private String apellidos;

    private String usuario;

    private String password;

    private String distrito;

    private String email;

    private String telefono;

    private String rol;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String apellidos, String usuario, String password, String distrito, String email, String telefono, String rol) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.password = password;
        this.distrito = distrito;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
    
    
}
