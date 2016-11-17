package ingsw;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpertoGestionEjercicioTest {

	/**
	 * Prueba cuando se registra correctamente un ejercicio
	 * 
	 * @Procedimiento:
	 * 		Se crea un usuario y un ejercicio.
	 * 		Se registra un ejercicio a un usuario.
	 * 		Se consulta si se registró el ejercicio especificado.
	 * 		El resultado deberia ser verdadero.
	 */
	@Test
	public void testRegistrarEjercicio() {
		Usuario usuario1 = new Usuario(1,"Erick","Mendoza");
		Ejercicio ej1 = new Ejercicio(1,"Ejercicio 1");
		
		ExpertoGestionEjercicio exp = new ExpertoGestionEjercicio();
		
		exp.registrarEjercicio(usuario1, ej1, "tatatata");
		
		boolean resultadoReal = exp.consultaEjercicio(usuario1, ej1);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * Prueba cuando no se registra un ejercicio
	 * 
	 * @Procedimiento:
	 * 		Se crea un usuario y dos ejercicios.
	 * 		Se registra el ejercicio 1 al usuario.
	 * 		Se consulta si se registró el ejercicio2 .
	 * 		El resultado deberia ser falso.
	 */
	@Test
	public void testRegistrarEjercicio1() {
		
		Usuario usuario1 = new Usuario(1,"Erick","Mendoza");
		Ejercicio ej1 = new Ejercicio(1,"Ejercicio 1");
		Ejercicio ej2 = new Ejercicio(2,"Ejercicio 2");
		
		ExpertoGestionEjercicio exp = new ExpertoGestionEjercicio();
		
		exp.registrarEjercicio(usuario1, ej1, "es que no me tienen paciencia");
		
		boolean resultadoReal = exp.consultaEjercicio(usuario1, ej2);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * Prueba cuando se califica un ejercicio
	 * 
	 * @Procedimiento:
	 * 		Se crea un usuario y un ejercicio.
	 * 		Se registra el ejercicio 1 al usuario, dentro del registro se califica.
	 * 		Se consulta si se calificó el ejercicio.
	 * 		El resultado deberia ser verdadero.
	 */
	@Test
	public void testcalificarEjercicio(){
		Usuario usuario1 = new Usuario(1,"Erick","Mendoza");
		Ejercicio ej1 = new Ejercicio(1,"Ejercicio 1");
		
		ExpertoGestionEjercicio exp = new ExpertoGestionEjercicio();
		
		exp.registrarEjercicio(usuario1, ej1, "tatatata");
		
		boolean resultadoReal = exp.consultaPuntuacionEjercicio(usuario1, ej1);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * Prueba cuando no se califica un ejercicio
	 * 
	 * @Procedimiento:
	 * 		Se crea un usuario y dos ejercicios.
	 * 		Se registra el ejercicio 1 al usuario, dentro del registro se califica.
	 * 		Se consulta si se calificó el ejercicio2 .
	 * 		El resultado deberia ser falso.
	 */
	@Test
	public void testcalificarEjercicio2(){
		Usuario usuario1 = new Usuario(1,"Erick","Mendoza");
		Ejercicio ej1 = new Ejercicio(1,"Ejercicio 1");
		Ejercicio ej2 = new Ejercicio(2,"Ejercicio 2");
		
		ExpertoGestionEjercicio exp = new ExpertoGestionEjercicio();
		
		exp.registrarEjercicio(usuario1, ej1, "es que no me tienen paciencia");
		
		boolean resultadoReal = exp.consultaPuntuacionEjercicio(usuario1, ej2);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
