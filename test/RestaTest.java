import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void testRealizarResta1() {

		int resultadoReal = Resta.realizarResta(1,2);
		int resultadoEsperado = -1;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
	
	@Test
	public void testRealizarResta2() {
		
		int resultadoReal = Resta.realizarResta(2,1);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
	
	@Test
	public void testRealizarResta3() {
		
		int resultadoReal = Resta.realizarResta(1,1);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
	
	@Test
	public void testRealizarResta4() {
		
		int resultadoReal = Resta.realizarResta(-1,1);
		int resultadoEsperado = -2;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

	@Test
	public void testRealizarResta5() {
		
		int resultadoReal = Resta.realizarResta(1,-1);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
}
