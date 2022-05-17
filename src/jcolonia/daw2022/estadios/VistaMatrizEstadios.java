package jcolonia.daw2022.estadios;

import java.util.Scanner;

/**
 * Almacena la entrada por pantalla
 * @author Daniel Marian Croitoru
 *
 */
public class VistaMatrizEstadios {

	/**
	 * Gestiona la salida por pantalla
	 */
	protected Scanner sc;

	/**
	 * @param sc Gestiona la salida por pantalla
	 */
	public VistaMatrizEstadios(Scanner sc) {
		this.sc = sc;
	}

	/**
	 * Devuelve la entrada
	 * @return entrada
	 */
	public Scanner getEntrada() {
		return sc;
	}

	/**
	 * Muestra texto
	 * @param texto que se quiere mostrar
	 */
	public static void mostrarTexto(String texto) {

	}
}
