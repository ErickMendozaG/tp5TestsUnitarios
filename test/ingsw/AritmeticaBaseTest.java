package ingsw;

import static org.junit.Assert.*;

import org.junit.Test;

public class AritmeticaBaseTest {

	@Test
	public void testSumar() {
		int resultadoReal = AritmeticaBase.sumar(2, 4);
		int resultadoEsperado = 6;
		assertEquals(resultadoEsperado,resultadoReal);
		
	}

	@Test
	public void testSumar1() {
		int resultadoReal = AritmeticaBase.sumar(-2, 4);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado,resultadoReal);
		
	}
	@Test
	public void testSumar2() {
		int resultadoReal = AritmeticaBase.sumar(0, 4);
		int resultadoEsperado = 4;
		assertEquals(resultadoEsperado,resultadoReal);
		
	}
	@Test
	public void testSumar3() {
		int resultadoReal = AritmeticaBase.sumar(-2, -4);
		int resultadoEsperado = -6;
		assertEquals(resultadoEsperado,resultadoReal);
		
	}
	
	@Test
	public void testSumar4() {
		int resultadoReal = AritmeticaBase.sumar(987654321, 123456789);
		int resultadoEsperado = 1111111110;
		assertEquals(resultadoEsperado,resultadoReal);
		
	}
}
