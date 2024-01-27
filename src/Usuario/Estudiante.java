
package Usuario;

/**
 *
 * @author juan5
 */

  // Clase Estudiante que extiende Usuario
public class Estudiante extends Usuario {
    private String grado;

    public Estudiante(String nombre, String apellido, String numeroIdentificacion, String grado) {
        super(nombre, apellido, numeroIdentificacion);
        this.grado = grado;
    }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }

    @Override
    public void mostrarInformacionEspecificaUsuario() {
      
        System.out.println("Grado: " + grado);
    }
}

