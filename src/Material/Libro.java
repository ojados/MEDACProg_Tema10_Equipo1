
package Material;

/**
 * @author Darwin Alemán
 * @author William Zapata
 */

public class Libro extends Material {

	/**
	 * Numero de paginas del libro
	 */
	private int numeroPaginas;
	/**
	 * Indica si el libro esta prestado o no
	 */
	private boolean prestado;

	/**
	 * Constructor.
	 *
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param anyo
	 * @param numeroPaginas
	 */
	public Libro(String isbn, String titulo, String autor, int anyo, int numeroPaginas) {
		super(isbn, titulo, autor, anyo);
		this.numeroPaginas = numeroPaginas;
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
		return "Libro: Numero Paginas=" + numeroPaginas + ", prestado=" + prestado + ", ISBN=" + getIsbn() + ", Titulo="
				+ getTitulo() + ", Autor=" + getAutor() + ", Anyo=" + getAnyo() + "]";
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
