package jcolonia.daw2022.estadios;


import java.util.Scanner;

/**
 * Vista Menu que crea el menu que se usara en el proyecto
 * @author Daniel Marian Croitoru
 *
 */
public class VistaMenuEstadios extends VistaMatrizEstadios{
	/**
	 * Define el texto para identificar las opciones
	 */
	private String [] textoOpciones;
	
	/**
	 * Constructor de la clase
	 * @param sc gestiona la salida por pantalla
	 * @param textoOpciones define el texto para identificar las opciones
	 * 
	 */
	public VistaMenuEstadios (Scanner sc, String [] textoOpciones) {
		super(sc);
		
		this.textoOpciones = new String[textoOpciones.length];
	
		for (int i = 0; i < textoOpciones.length; i++) {
	
			this.textoOpciones[i] = textoOpciones[i];
		}
	}
	/**
	 * Muestra el menu
	 */
	public void mostrarMenu() {
		for(int i=0; i<textoOpciones.length; i++)
		{
			System.out.printf(" #%d  --  %s%n", (i+1), textoOpciones[i]);
		}
		System.out.printf(" #0  --  Salir%n");
		System.out.println();
	}
	/** 
	 * Definira una entrada por teclado la cual el usuario elegira la opcion
	 * @return numero elegido
	 * 
	 */
	public int pedirOpcion() {
		String lineaTexto = "";
		int numero = 0;
		boolean numEsCorrecto = false;
		Scanner entrada = getEntrada();
		
		System.out.println("Introduce la opcion del menu elegida");
		while(!numEsCorrecto)
		{
			try {
				lineaTexto = entrada.nextLine();
				numero = Integer.parseInt(lineaTexto);
				
				if(numero < 0 || numero > textoOpciones.length)
				{
					System.out.println("No ha elegido una opcion valida");
				} else {
					numEsCorrecto = true;
				}
			} catch (NumberFormatException e) {
				System.out.printf("\tNo es una de las opciones validas: <<%s>>%n", e.getMessage());
			}
		}
    	
    	return numero;
	}
	/** 
	 * Muestra texto por pantalla
	 * @param format
	 */
	public static void mostrarTexto(String format) {
		// TODO Esbozo de método generado automáticamente
		
	}
}
