package jcolonia.daw2022.estadios;

/**
 * Conjunto de estadios
 * @author Daniel Marian Croitoru
 *
 */
public class Estadios {
	
	/**
	 * Nombre del estadio
	 */
	private String nombre;
	/**
	 * Equipo del estadio
	 */
	private String equipo;
	/**
	 * Presidente del estadio
	 */
	private String presidente;
	/**
	 * Capacidad de espectadores del estadio
	 */
	private int espectadores;
	/**
	 *  Tamaño del estadio
	 */
	private TamañoEnum tamaño;
	/**
	 * Tipos de entradas del estadio
	 */
	private EntradasEnum entradas;
	/**
	 * Cubierta del estadio
	 */
	private boolean cubierta;
	
	/**
	 *  Constructor vacio
	 */
	public Estadios () {
		
	}
	
	/**
	 * Devuelve el nombre
	 * @return el nombre del estadio
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre
	 * @param nombre que se quiere asignar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el equipo
	 * @return el equipo del estadio
	 */
	public String getEquipo() {
		return equipo;
	}
	/**
	 * Establece el equipo
	 * @param equipo que se quiere asignar
	 */
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	/**
	 * Devuelve el presidente
	 * @return el presidente del estadio
	 */
	public String getPresidente() {
		return presidente;
	}
	/**
	 * Establece el presidente
	 * @param presidente que se quiere asignar
	 */
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	/**
	 * Devuelve cantidad de espectadores 
	 * @return los espectadores del estadio
	 */
	public int getEspectadores() {
		return espectadores;
	}
	/**
	 * Establece espectadores
	 * @param espectadores que se quieren asignar
	 */
	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}
	/**
	 * Devuelve el tamaño
	 * @return el tamaño del estadio
	 */
	public TamañoEnum getTamaño() {
		return tamaño;
	}
	/**
	 * Establece el tamaño
	 * @param eleccion 
	 * @param tamaño
	 */
	
	public void setTamaño(TamañoEnum eleccion) {
		this.tamaño = eleccion;
	}
	
	/**
	 * Establece el tamaño
	 * @param elegir el tamaño a asignar
	 */
	public void setTamaño(String elegir) {
		TamañoEnum tamaño = TamañoEnum.valueOf(elegir);
		this.tamaño = tamaño;	
	}
	
	/**
	 * Devuelve las entradas
	 * @return entradas que se quieren devolver
	 */
	public EntradasEnum getEntradas() {
		return entradas;
	}
	
	/**
	 * Establece la entrada a elegir
	 * @param eleccion2 de la entrada
	 */
	public void setEntradas(EntradasEnum eleccion2) {
		this.entradas = eleccion2;
	}
	
	/**
	 * Establece la la entrada a elegir
	 * @param elegir la entrada
	 */
	public void setEntradas(String elegir) {
		EntradasEnum entradas = EntradasEnum.valueOf(elegir);
		this.entradas = entradas;	
	}
	
	/**
	 * Devuelve la cubierta
	 * @return cubierta que se quiere devolver
	 */
	public boolean getCubierta() {
		return cubierta;
	}
	
	/**
	 * Establece la cubierta
	 * @param cubierta que se quiere asignar
	 */
	public void setCubierta(boolean cubierta) {
		this.cubierta= cubierta;
	}
	
	/**
	 * Establece la cubierta
	 * @param texto que se quiere asignar
	 */
	public void setCubierta(String texto) {
		if("false".equals(texto)) {
			cubierta = false;
		} else if("true".equals(texto)){
			cubierta = true;
		}
	}
	/**
	 * Recoge los valores de la linea y los implementa en un objeto
	 * @param línea de la cual se sacan los datos
	 */
	public void restaurarLínea(String línea) {
		String[] lista;
		lista= línea.split("#");

		setNombre(lista[1]);
		setEquipo(lista[2]);
		setPresidente(lista[3]);
		setEspectadores(Integer.parseInt(lista[4]));
		setTamaño(lista[5]);
		setEntradas(lista[6]);
		setCubierta(lista[7]);
		}
	/**
	 * Muestra texto en pantalla
	 * @return texto en pantalla
	 */
	public String toString() {
		String texto="";
		texto = String.format("| %5s | %5s | %5s | %5s | %5s | %5s |%5s|", getNombre(), getEquipo(), getPresidente(), 
				getEspectadores(), getTamaño(), getEntradas(), getCubierta()?"Si":"No");
		return texto;
	}
	
	/**
	 * Exporta texto en archivo
	 * @return texto en archivo
	 */
	public String toStringTXT() {
		String texto="";
		texto = String.format("#%s#%s#%s#%s#%s#%s#%s", getNombre(), getEquipo(), getPresidente(), 
				getEspectadores(), getTamaño(), getEntradas(), getCubierta());
		return texto;
	}
}