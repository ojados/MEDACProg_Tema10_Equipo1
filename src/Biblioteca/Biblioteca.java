
package Biblioteca;

import Material.Material;
import Prestamo.Prestamo;
import Usuario.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;



/**
 * @author Carlos Pavón
 * @author Carlos Camisón
 */
public class Biblioteca implements IBiblioteca {

	/**
	 * Lista de los prestamos
	 */
	private ArrayList<Prestamo> prestamos;
	/**
	 * Lista de los usuarios de la biblioteca
	 */
	private ArrayList<Usuario> usuarios;

	public Biblioteca() {
		prestamos = new ArrayList<>();
		usuarios = new ArrayList<>();
	}

	/**
	 * Realiza un prestamo y lo registra
	 *
	 * @param material
	 * @param usuario
	 * @param fecha
	 */
	public void prestarMaterial(Material material, Usuario usuario, LocalDate fecha) {
		usuarios.add(usuario);
		Prestamo prestamo = new Prestamo(material, usuario);
		prestamo.registrarPrestamo(fecha);
		prestamos.add(prestamo);

	}

	/**
	 * Realiza una devolucion y la registra
	 *
	 * @param material
	 * @param fecha
	 */
	public void devolverMaterial(Material material, LocalDate fecha) {
		// Buscamos el prestamo de este material
		for (Prestamo prestamo : prestamos) {
			// Comparamos por el isbn que ha de ser unico (quiza interesaria implementar
			// metodo equals)
			if (material.getIsbn().equals(prestamo.getMaterialPrestado().getIsbn())) {
				prestamo.registrarDevolucion(fecha);
			}

		}

	}

	/**
	 * Muestra la informacion de los prestamos
	 */
	public void mostrarInformacionPrestamos() {
		System.out.println("Prestamos:");
		for (Prestamo prestamo : prestamos) {
			System.out.println("Prestamo -> ");
			prestamo.getMaterialPrestado().mostrarInformacionEspecifica();
			prestamo.getUsuario().mostrarInformacionEspecificaUsuario();
			System.out.println("Fecha prestamo: " + prestamo.getFechaPrestamo() + " Fecha devolucion "
					+ prestamo.getFechaDevolucion());
		}
	}

}
