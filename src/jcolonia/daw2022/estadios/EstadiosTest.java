package jcolonia.daw2022.estadios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Tests estadios
 * @author Daniel Marian Croitoru
 *
 */
class EstadiosTest {

	/**
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test constructor sin argumentos
	 */
	@Test
	@DisplayName("ConstructorSinArgumentos")
	public void ConstructorTest() {
		Estadios estadioTest = new Estadios();
		assertEquals(null,estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertEquals(false,estadioTest.getCubierta());
	}
	
	/**
	 * Test nombre con argumentos
	 */
	@Test
	@DisplayName("NombreConArgumentos")
	public void setNombreTest() {
		Estadios estadioTest = new Estadios();
		estadioTest.setNombre("Maradona");
		assertEquals("Maradona",estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertEquals(false,estadioTest.getCubierta());
}
	/**
	 * Test equipo con argumentos
	 */
	@Test
	@DisplayName("EquipoConArgumentos")
	public void setEquipoTest() {
		Estadios estadioTest = new Estadios();
		estadioTest.setEquipo("Real Madrid");
		assertEquals(null,estadioTest.getNombre());
		assertEquals("Real Madrid",estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertEquals(false,estadioTest.getCubierta());
}
	/**
	 * Test presidente con argumentos
	 */
	@Test
	@DisplayName("PresidenteConArgumentos")
	public void setPresidenteTest() {
		Estadios estadioTest = new Estadios();
		estadioTest.setPresidente("Laporta");
		assertEquals(null,estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals("Laporta",estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertEquals(false,estadioTest.getCubierta());
}
	/**
	 * Test espectadores con argumentos
	 */
	@Test
	@DisplayName("EspectadoresConArgumentos")
	public void setEspectadoresTest() {
		Estadios estadioTest = new Estadios();
		estadioTest.setEspectadores(68000);
		assertEquals(null,estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(68000,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertEquals(false,estadioTest.getCubierta());
}
	/**
	 * Test tamaño con argumentos
	 */
	@Test
	@DisplayName("TamañoConArgumentos")
	public void setTamaño() {
		Estadios estadioTest = new Estadios();
		estadioTest.setTamaño("MEDIANO");
		assertEquals(null,estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(TamañoEnum.MEDIANO,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertFalse(estadioTest.getCubierta());
}
	/**
	 * Test entradas con argumentos
	 */
	@Test
	@DisplayName("EntradasConArgumentos")
	public void setEntradas() {
		Estadios estadioTest = new Estadios();
		estadioTest.setEntradas("DE_LUJO");
		assertEquals(null,estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(EntradasEnum.DE_LUJO,estadioTest.getEntradas());
		assertFalse(estadioTest.getCubierta());
}
	/**
	 *  Test cubierta con argumentos
	 */
	@Test
	@DisplayName("CubiertaConArgumentos")
	public void setCubiertaTest() {
		Estadios estadioTest = new Estadios();
		estadioTest.setCubierta("false");
		assertEquals(null,estadioTest.getNombre());
		assertEquals(null,estadioTest.getEquipo());
		assertEquals(null,estadioTest.getPresidente());
		assertEquals(0,estadioTest.getEspectadores());
		assertEquals(null,estadioTest.getTamaño());
		assertEquals(null,estadioTest.getEntradas());
		assertFalse(estadioTest.getCubierta());
}
	

}
