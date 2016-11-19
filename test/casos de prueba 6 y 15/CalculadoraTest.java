import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testCalculadora1() {
		
		Usuario alumno = new Usuario(2);
		Calculadora calc = new Calculadora(alumno);
		
	}
	
	@Test
	public void testCalculadora2() {
		
		Usuario alumno = new Usuario(1);
		Calculadora calc = new Calculadora(alumno);
		
	}

}
