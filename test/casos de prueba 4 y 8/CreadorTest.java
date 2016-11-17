import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CreadorTest {
	
    @Before
	  public void setUp() {
	    IUsuarioDAO udao = new MockUsuarioDAO(false);
	    try {
		    Usuario usuario1 = new Usuario();
		    usuario1.setId(1);
		    usuario1.setNombre("Pablo");
		    usuario1.setApellido("Marinozi");
		    usuario1.setNivel("Principiante");
		    Usuario usuario2 = new Usuario();
		    usuario2.setId(2);
		    usuario2.setNombre("Maribel");
		    usuario2.setApellido("Martinez");
		    usuario2.setNivel("Principiante");
		    Usuario usuario3 = new Usuario();
		    usuario3.setId(3);
		    usuario3.setNombre("Gonzalo");
		    usuario3.setApellido("Sanchez");
		    usuario3.setNivel("Principiante");
		    udao.addUsuario(usuario1);
		    udao.addUsuario(usuario2);
		    udao.addUsuario(usuario3);
	    } catch (DAOException e) {
	      e.printStackTrace();
	    }
	       
	    Creador creador = Creador.getInstancia();
	    creador.setUsuarioDAO(udao);
	  }

	@Test
	public void testCrearUsuario1() {
		try{
			String nombre = "Sebastián";
			String apellido = "Morón";
			String nivel = "Principiante";
			Creador creador = Creador.getInstancia();
			Usuario usuario1 = creador.crearUsuario(nombre, apellido, nivel);
			Usuario usuario2 = creador.crearUsuario(nombre, apellido, nivel);
			fail("Se esperaba excepción CreationException");
		}catch (CreationException e){}
	}
	
	@Test
	public void testCrearUsuario2() {
		try{
			String nombre = "Sebastián";
			String apellido = "Morón";
			String nivel = "Principiante";
			String nombre2 = "Juan";
			String apellido2 = "Pérez";
			String nivel2 = "Principiante";
			Creador creador = Creador.getInstancia();
			Usuario usuario1 = creador.crearUsuario(nombre, apellido, nivel);
			Usuario usuario2 = creador.crearUsuario(nombre2, apellido2, nivel2);
		}catch (CreationException e){
			fail("Lanzada excepción CreationException no esperada");
		}
	}
	
	@Test
	public void testCrearUsuario3() {
		try{
			String nombre = "Pablo";
			String apellido = "Marinozi";
			String nivel = "Principiante";
			Creador creador = Creador.getInstancia();
			Usuario usuario1 = creador.crearUsuario(nombre, apellido, nivel);
			fail("Se esperaba excepción CreationException");
		}catch (CreationException e){}
	}
}
