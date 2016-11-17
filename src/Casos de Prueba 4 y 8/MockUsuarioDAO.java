import java.util.ArrayList;

public class MockUsuarioDAO implements IUsuarioDAO {
	  ArrayList<Usuario> listaUsuarios;
	  boolean falloConexion;
	     
	  public MockUsuarioDAO(boolean falloConexion) {
		  listaUsuarios = new ArrayList<Usuario>();
		  this.falloConexion = falloConexion;
	  }
	     
	  private void compruebaConexion() throws DAOException {
	    if(falloConexion) {
	      throw new DAOException("Fallo al conectar a la BD");
	    }       
	  }
	     
	  public void addUsuario(Usuario usuario) throws DAOException {
	    this.compruebaConexion();
	    if(this.getUsuario(usuario.getId()) == null) {
	      listaUsuarios.add(usuario);
	    } else {
	      throw new DAOException("El usuario ya existe en la BD");
	    }
	  }
	 
	  public void borrarUsuario(int idUsuario) throws DAOException {
	    this.compruebaConexion();
	    Usuario usuario = this.getUsuario(idUsuario); 
	    if(usuario != null) {
	      listaUsuarios.remove(usuario);
	    } else {
	      throw new DAOException("El empleado no existe en la BD");
	    }
	  }
	 
	  public Usuario getUsuario(int idUsuario) throws DAOException {
	    this.compruebaConexion();
	    for(Usuario usuario: listaUsuarios) {
	      if(usuario.getId() == idUsuario) {
	        return usuario;
	      }
	    }    
	    return null;
	  }
	  
	  public Usuario getUsuario(String nombre, String apellido) throws DAOException {
		    this.compruebaConexion();
		    for(Usuario usuario: listaUsuarios) {
		      if(usuario.getNombre() == nombre && usuario.getApellido() == apellido){
		        return usuario;
		      }
		    }    
		    return null;
		  }
	  
	  public ArrayList<Usuario> getUsuarios() throws DAOException {
	    this.compruebaConexion();
	    return listaUsuarios;
	  }
}
