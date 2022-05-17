package jcolonia.daw2022.estadios;

import static java.lang.System.out;


import java.util.Scanner;

/**
 * 
 * Clase principal que gestiona el menu
 * 
 * @author Daniel Marian Croitoru
 *
 */
public class ControlEstadios {
	/**
	 * Atributo que gestiona la entrada por pantalla
	 */
	private Scanner sc;
	/**
	 * Conjunto donde se guardan todos los estadios
	 */
	private Registro registroPrincipal;
	
	/**
	 *  Constante la cual indica las opciones del menu
	 */
	private static final String[] OPCIONES_MENU_PRINCIPAL = {"Añadir nuevo conjunto de datos ","Ver el listado ",
	"Importar datos desde archivo ","Exportar datos a archivo "};
	
	/**
	 * @param sc Gestiona la entrada por pantalla
	 */
	public ControlEstadios (Scanner sc) {
		this.sc=sc;
		registroPrincipal = new Registro();
	}
	
	/**
	 * Metodo que recorre todas las opciones que tendra el menu
	 */
	public void buclePrincipal() {
		int opcionElegida = -1;
		boolean salir = false;

		VistaMenuEstadios menu = new VistaMenuEstadios(sc, OPCIONES_MENU_PRINCIPAL);

		while (!salir) {
			menu.mostrarMenu();
			opcionElegida = menu.pedirOpcion();
			VistaMenuEstadios.mostrarTexto(String.format("%d", opcionElegida));
			switch (opcionElegida) {
			case 0:
				out.println("-------------------------------------------------------------------//");
				out.println(" Acerca de...");
				out.println("-------------------------------------------------------------------//");
				out.println("		Proyecto Realizado por: Daniel Marian Croitoru");
				out.println("-------------------------------------------------------------------//");
				out.println("		Entregado en la fecha: 27/04/2022");
				out.println("-------------------------------------------------------------------//");
				out.println("		Prototipo de aplicacion: Menu");
				out.println("-------------------------------------------------------------------//");
				out.println("		Almacena elementos como cadenas de textos y numeros");
				out.println("-------------------------------------------------------------------//");
				out.println("		Lista los datos citados");
				out.println("-------------------------------------------------------------------//");
				out.println("		Importa y exporta los datos");
				out.println("-------------------------------------------------------------------//");
				return;
			case 1:
				gestiónAltas();
				break;
			case 2:
				gestiónListado();
				break;
			case 3:
				AccesoDatos datos = new AccesoDatos(sc,registroPrincipal);
				registroPrincipal=datos.importarNombres();
				break;
			case 4:
				AccesoDatos datos2 = new AccesoDatos(sc,registroPrincipal);
				datos2.exportarNombres();
				break;
			}
		}
	}
	/**
	 * Incorpora nombres a la lista. Solicita los nombres nuevos y pide la
	 * confirmación antes de la incorporación definitiva a la lista. Lee los nombres
	 * por teclado a una lista provisional y tras la confirmación los vuelca a la
	 * lista general
	 */
	public void gestiónAltas() {
		VistaAltasEstadios altas = new VistaAltasEstadios(sc);
		Estadios estadionuevo = new Estadios();
		altas.cargarNombres(estadionuevo);
		registroPrincipal.añadir(estadionuevo);
	}
	/**
	 * Muestra por pantalla el conjunto de datos introducidos
	 * 
	 */
	public void gestiónListado() {
		VistaListadoEstadios lista = new VistaListadoEstadios(sc);
		lista.mostrarLista(registroPrincipal);
	}
	/**
	 * Ejecuta el bucle principal
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ControlEstadios controlGeneral = new ControlEstadios(sc);
		controlGeneral.buclePrincipal();
	}
}
