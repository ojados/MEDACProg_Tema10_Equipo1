


package Prestamo;

import Material.Material;
import Usuario.Usuario;
import java.time.LocalDate;
/**
 * @author Daniel Rodriguez
 * @author Esther Manresa
 */
public class Prestamo {

	/**
	 * El material prestado
	 */
	private Material materialPrestado;
	/**
	 * Usuario que ha realizado el prestamo
	 */
	private Usuario usuario;
	/**
	 * Fecha en que se ha realizado el prestamo
	 */
	private LocalDate fechaPrestamo;
	/**
	 * Fecha de la devolucion
	 */
	private LocalDate fechaDevolucion;

	/**
	 * Constructor
	 *
	 * @param materialPrestado
	 * @param usuario
	 */
	public Prestamo(Material materialPrestado, Usuario usuario) {
		this.materialPrestado = materialPrestado;
		this.usuario = usuario;
	}

	/**
	 * @return Material
	 */
	public Material getMaterialPrestado() {
		return materialPrestado;
	}

	/**
	 * @param materialPrestado
	 */
	public void setMaterialPrestado(Material materialPrestado) {
		this.materialPrestado = materialPrestado;
	}

	/**
	 * @return Usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return fecha del prestamo
	 */
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	/**
	 * @param fechaPrestamo
	 */
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	/**
	 * @return fecha de la devolucion
	 */
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	/**
	 * @param fechaDevolucion
	 */
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	/**
	 * Registra el prestamo NOTA: se ha incluido el parametro fecha del prestamo no
	 * indicado en las especificaciones
	 *
	 * @param fecha fecha del prestamo
	 */
	public void registrarPrestamo(LocalDate fecha) {
		materialPrestado.prestar();
		fechaPrestamo = fecha;
	}

	/**
	 * Registra la devolucion. NOTA: se ha incluido el parametro fecha de la
	 * devolucion no indicado en las especificaciones
	 *
	 * @param fecha fecha de la devolucion
	 */
	public void registrarDevolucion(LocalDate fecha) {
		materialPrestado.devolver();
		fechaDevolucion = fecha;
	}

}
