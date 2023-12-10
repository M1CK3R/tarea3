package mvc.models;

public class usuario {
    private String usuario;
    private String contrasena;

    public usuario(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public usuario(){
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
