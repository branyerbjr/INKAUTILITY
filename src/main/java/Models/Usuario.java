package Models;

public class Usuario {
    private int idUsuario;
    private String Nombres;
    private String Apellidos;
    private String dni;
    private String Email;
    private String Pass;
    private Byte Genero;
    private String Movil;

    public Usuario() {
    }

    public Usuario(String nombres, String apellidos, String dni, String email, String pass, Byte genero, String movil) {
        Nombres = nombres;
        Apellidos = apellidos;
        this.dni = dni;
        Email = email;
        Pass = pass;
        Genero = genero;
        Movil = movil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public Byte getGenero() {
        return Genero;
    }

    public void setGenero(Byte genero) {
        Genero = genero;
    }

    public String getMovil() {
        return Movil;
    }

    public void setMovil(String movil) {
        Movil = movil;
    }
}
