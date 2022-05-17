package jcolonia.daw2022.estadios;

import static java.lang.System.err;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase de Acceso a Datos el cual tiene 2 metodos, uno para exportar en formato txt la lista de los datos introducidos
 * y otro metodo el cual importa el archivo creado con los datos
 * @author Daniel Marian Croitoru
 */
public class AccesoDatos extends VistaMatrizEstadios{
	/**
	 * Constante la cual se le asigna el nombre del archivo a exportar/importar
	 */
	private static final String NOMBRE_ARCHIVO = "Estadios.txt";
	
	/**
	 * Conjunto donde se guardan todos los estadios
	 */
	private Registro registroPrincipal;
	
	/**
	 * @param sc Gestiona los datos que saldran por pantalla
	 * @param registroGrupo Toma el lugar del registroPrincipal
	 */
	public AccesoDatos(Scanner sc, Registro registroGrupo) {
		super(sc);
		registroPrincipal = registroGrupo;
	}
	;
	/**
	 * Exporta los nombres de la lista
	 * 
	 *  @throws FileNotFoundException salta cuando no encuentra el archivo.
	 */
	public void exportarNombres() {
		try (PrintWriter salida = new PrintWriter(NOMBRE_ARCHIVO)) {
			for (int i=0;i<registroPrincipal.getNumEstadios();i++) {
				registroPrincipal.consultar(i);
			}	
			for (Estadios texto : registroPrincipal) {
				salida.println(texto.toStringTXT());
			}
		} catch (FileNotFoundException e) {
			err.printf("Archivo no encontrado", e.getLocalizedMessage());
		}
	}

	/**
	 * Importa los datos desde el archivo en el cual se exportaron anteriormente
	 * 
	 * @return registroNuevo devuelve un conjunto de datos
	 * @throws FileNotFoundException salta cuando no encuentra el archivo.
	 * @throws IOException salta cuando el usuario introduce datos incorrectos en el programa
	 * 
	 */
	public Registro importarNombres() {
		String texto;
		Registro registroNuevo = new Registro();
		
		try (
			FileReader fr = new FileReader(NOMBRE_ARCHIVO);
			BufferedReader in = new BufferedReader(fr);) {
			boolean salirYa = false;
			while (!salirYa) {
				Estadios estadioNuevo = new Estadios();
				texto = in.readLine();
				if (texto == null) {
					salirYa = true;
				} else {
					estadioNuevo.restaurarLínea(texto);
					registroNuevo.añadir(estadioNuevo);
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			err.println("Archivo no encontrado");
		} catch (IOException e) {
			err.printf("Error de escritura: %s", e.getLocalizedMessage());
		}
		return registroNuevo;
	}
}
