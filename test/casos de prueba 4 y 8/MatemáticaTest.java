import static org.junit.Assert.*;

import org.junit.Test;

public class MatemáticaTest {

	@Test
	public void testmultiplicar1() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(0,2);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	public void testmultiplicar2() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(2, 0);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar3() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(1,8);
		int resultadoEsperado = 8;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar4() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(50,1);
		int resultadoEsperado = 50;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar5() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(-7,8);
		int resultadoEsperado = -56;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar6() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(5,3);
		int resultadoEsperado = 15;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar7() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(-7,-8);
		int resultadoEsperado = 56;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar8() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(-8,-7);
		int resultadoEsperado = 56;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	public void testmultiplicar9() {
		Matemática mat = new Matemática();
		int resultadoReal = mat.multiplicar(7,-8);
		int resultadoEsperado = -56;
		assertEquals(resultadoReal, resultadoEsperado);
	}
}
