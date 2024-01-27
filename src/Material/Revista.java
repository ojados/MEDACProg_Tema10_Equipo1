
package Material;

/**
 * @author Darwin Alemán
 * @author William Zapata
 */

public class Revista extends Material implements Prestable {

	/**
	 * Numero de articulos en la revista
	 */
	private int numeroArticulos;
	/**
	 * Indica si la revista esta prestado o no
	 */
	private boolean prestado;

	/**
	 *
	 * Constructor.
	 *
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param anyo
	 * @param numeroArticulos
	 */
	public Revista(String isbn, String titulo, String autor, int anyo, int numeroArticulos) {
		super(isbn, titulo, autor, anyo);
		this.numeroArticulos = numeroArticulos;
		prestado = false;
	}

	/**
	 * @return true si prestado, false si disponible
	 */
	public boolean isPrestado() {
		return prestado;
	}

	@Override
	public String toString() {
		return "Revista: Numero articulos=" + numeroArticulos + ", prestado=" + prestado + ", ISBN=" + getIsbn()
				+ ", Titulo=" + getTitulo() + ", Autor=" + getAutor() + ", Anyo=" + getAnyo() + "]";
	}

	@Override
	public void prestar() {
		prestado = true;

	}

	@Override
	public void devolver() {
		prestado = false;

	}

	@Override
	public void mostrarInformacionEspecifica() {
		System.out.println(this.toString());

	}

}