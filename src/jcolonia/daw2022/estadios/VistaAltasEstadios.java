package jcolonia.daw2022.estadios;

import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * Metodo que añade datos en estadios
 * @author Daniel Marian Croitoru
 *
 */
public class VistaAltasEstadios extends VistaMatrizEstadios {
	
	String entrada;
	/**
	 * @param sc Gestiona la salida por pantalla
	 */

	public VistaAltasEstadios (Scanner sc) {
		super(sc);
		this.sc=sc;
	}

	/**
	 * Carga la informacion proporcionada por los usuarios
	 * @param estadio Objeto vacio a rellenar
	 */
	public void cargarNombres (Estadios estadio) {
		Scanner entrada = getEntrada();
		String texto;
		String textoCubierto;
		int numero;
		int tamaño;
		int entradas;
		int numCubierta;
		boolean cubierta;
		boolean seguir = false;
		String textoTamaño;
		String textoEntradas;
		TamañoEnum eleccion;
		EntradasEnum eleccion2;
		
		out.println("Introduzca el nombre del Estadio: ");
			texto=entrada.nextLine();
			estadio.setNombre(texto);
		out.println("Introduzca el equipo al que pertenece: ");
			texto=entrada.nextLine();
			estadio.setEquipo(texto);
		out.println("Introduzca el presidente: ");
			texto=entrada.nextLine();
			estadio.setPresidente(texto);
		while(!seguir) {
			out.println("Numero de espectadores posibles: ");
			try {
				texto=entrada.nextLine();
				if(texto.length() <5 || texto.length() >6) {
					err.println("El dato introducido debe tener entre 5 y 6 numeros");
				} else {
				numero=Integer.parseInt(texto);
				estadio.setEspectadores(numero);
				seguir = true;
				}
			} catch (NumberFormatException e) {
				err.println("Dato introducido incorrecto");
			}
		}
			seguir = false;
			while(!seguir) {
				out.println("Tamaño del estadio: ");

				int j = 0;
				for (TamañoEnum tipo : TamañoEnum.values()) {
					System.out.printf(" %d.- %s%n", ++j, tipo);
				}
				
				try {
					textoTamaño=entrada.nextLine();
					tamaño = Integer.parseInt(textoTamaño);
					eleccion = TamañoEnum.values()[tamaño - 1];
					estadio.setTamaño(eleccion);
					seguir = true;
				}	catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
					err.println("Opcion no encontrada");
				}
			}
			seguir = false;
			while(!seguir) {
				out.println("Tipo de entrada: ");

				int j = 0;
				for (EntradasEnum tipo : EntradasEnum.values()) {
					System.out.printf(" %d.- %s%n", ++j, tipo);
				}
				
				try {
					textoEntradas=entrada.nextLine();
					entradas = Integer.parseInt(textoEntradas);
					eleccion2 = EntradasEnum.values()[entradas - 1];
					estadio.setEntradas(eleccion2);
					seguir = true;
				}	catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
					err.println("Opcion no encontrada");
				}
			}
			seguir = false;
			while(!seguir) {
				out.println("¿Esta Cubierto?: ");
				out.println("1.Si\n2.No");
				try {
					textoCubierto = entrada.nextLine();
					numCubierta = Integer.parseInt(textoCubierto);
					switch(numCubierta) {
						case 1: 
							cubierta = true;
							estadio.setCubierta(cubierta);
							seguir = true;
						case 2:
							cubierta = false;
							estadio.setCubierta(cubierta);
							seguir = true;
					}
				} catch(NumberFormatException ex) {
					err.println("Opcion errónea");
				}
			}
			
			
	}
}