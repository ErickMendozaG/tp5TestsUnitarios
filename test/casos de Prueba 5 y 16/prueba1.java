package ingsw;

import static org.junit.Assert.*;

import org.junit.Test;

public class prueba1 {

	@Test
	public void testUsarCalculadora() {
		NivelUsuario nivel1 = new NivelUsuario("Avanzado");
		Usuarios usu1 = new Usuarios("gonzalo","sanchez",nivel1);
		
		boolean resultadoReal = usu1.usarCalculadora();
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado,resultadoReal);
		}
	
	@Test
	public void testUsarCalculadora2() {
		NivelUsuario nivel1 = new NivelUsuario("Principiante");
		Usuarios usu1 = new Usuarios("gonzalo","sanchez",nivel1);
		
		boolean resultadoReal = usu1.usarCalculadora();
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado,resultadoReal);
		}
	

}
