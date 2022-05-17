package jcolonia.daw2022.estadios;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Aqui se guardan los estadios
 * @author Daniel Marian Croitoru
 *
 */
public class Registro implements Iterable<Estadios> {
	
	/**
	 * Arraylist de estadios
	 */
	private ArrayList<Estadios> estadios;
	/**
	 * Posicion de estadios
	 */
	int posEstadios = 0;
	
	/**
	 *  Constructor de registro
	 */
	public Registro() {
		estadios = new ArrayList<Estadios>();
	}
	
	/**
	 *  Consulta la posicion
	 * @param posicion que se quiere consultar
	 * @return posicion a consultar
	 */
	public Estadios consultar(int posicion) {
		return estadios.get(posicion);
	}
	/**
	 * Consigue el numero de estadios
	 * @return longitud de estadios
	 */
	public int getNumEstadios() {
		return estadios.size();
	}
	
	/**
	 * Añade un estadio nuevo
	 * @param estadio añadido
	 */
	public void añadir (Estadios estadio) {
		estadios.add(estadio);
	}
	/**
	 * Iterator de estadios
	 * 
	 */
	public Iterator<Estadios> iterator() {
		// TODO Esbozo de método generado automáticamente
		return estadios.iterator();
	}
}

