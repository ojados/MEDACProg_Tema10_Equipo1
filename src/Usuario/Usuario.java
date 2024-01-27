
package Usuario;

/**
 *
 * @author juan5
 */
public abstract class Usuario {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroIdentificacion() {

        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {

        this.numeroIdentificacion = numeroIdentificacion;
    }

    public abstract void mostrarInformacionEspecificaUsuario();

}
