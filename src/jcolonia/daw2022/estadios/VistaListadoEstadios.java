package jcolonia.daw2022.estadios;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Metodo cuya funcion es mostrar por pantalla el listado de datos introducidos en el menu
 * @author Daniel Marian Croitoru
 *
 */
public class VistaListadoEstadios extends ControlEstadios {
	
/**
 * @param sc Gestiona la salida por pantalla
 */
public VistaListadoEstadios(Scanner sc) {
		super(sc);
	}
	/**
	 * Muestra la lista
	 * @param lista
	 */
	public void mostrarLista (Registro lista) {
		
		for(int i=0; i<lista.getNumEstadios(); i++) {
			out.println(lista.consultar(i));
		}
	}
}
