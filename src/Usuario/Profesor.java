
package Usuario;

/**
 *
 * @author juan5
 */
// Clase Profesor que extiende Usuario
public class Profesor extends Usuario {
    private String departamento;

    public Profesor(String nombre, String apellido, String numeroIdentificacion, String departamento) {
        super(nombre, apellido, numeroIdentificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public void mostrarInformacionEspecificaUsuario() {
     
        System.out.println("Departamento: " + departamento);
    }
}
