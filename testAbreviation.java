package gtd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testAbreviation {
	
	Abreviation motTest;
	
	@Before
	public void setUp() throws Exception {
		motTest = new Abreviation();
	}

	@After
	public void tearDown() throws Exception {
		motTest = null;
	}

	@Test
	public void testMotUnelettre() {
		assertEquals("a", motTest.abreger("a"));
	}
	
	@Test
	public void testMotDeuxlettres() {
		assertEquals("la", motTest.abreger("la"));
	}
	
	@Test
	public void testMotTroislettres() {
		assertEquals("a1i", motTest.abreger("ami"));
	}
	
	@Test
	public void testMotAvecTiret() {
		assertEquals("r9s", motTest.abreger("rendez-vous"));
	}

	@Test
	public void testMotAvecEspace() {
		assertEquals("r9s", motTest.abreger("rendez vous"));
	}
			
	@Test
	public void testMotAvecNombreALaFin() {
		assertEquals("w70", motTest.abreger("windows10"));
	}
	
	@Test
	public void testMotAvecNombreAuDebut() {
		assertEquals("36h", motTest.abreger("3D-brush"));
	}
	
	@Test
	public void testMotAvecNombreAuMilieu() { 
		assertEquals("p6D", motTest.abreger("paint 3D"));
	}
	
	@Test
	public void testNombre() {
		assertEquals("228", motTest.abreger("2018"));
	}
	
	@Test
	public void testUnEspaceAvantLeMot() {
		assertEquals("p7e", motTest.abreger(" parachute"));
	}
	
	@Test
	public void testUnEspaceApresLeMot() {
		assertEquals("p7e", motTest.abreger("parachute "));
	}
}
