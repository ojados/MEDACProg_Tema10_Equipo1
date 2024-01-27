
package Material;

/**
 * @author Darwin Alemán
 * @author William Zapata
 */

public abstract class Material implements Prestable {

	/**
	 * ISBN
	 */
	private String isbn;
	/**
	 * Titulo
	 */
	private String titulo;
	/**
	 * Autor
	 */
	private String autor;
	/**
	 * Anyo
	 */
	private int anyo;

	/**
	 * Constructor.
	 *
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param anyo
	 */
	public Material(String isbn, String titulo, String autor, int anyo) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anyo = anyo;
	}

	/**
	 * @return isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return anyo
	 */
	public int getAnyo() {
		return anyo;
	}

	/**
	 * @param anyo
	 */
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	/**
	 * Muestra informacion especifica del Material.
	 */
	public abstract void mostrarInformacionEspecifica();

}