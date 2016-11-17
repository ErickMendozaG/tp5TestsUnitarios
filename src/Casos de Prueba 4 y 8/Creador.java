
public class Creador {
	
	private static Creador instancia = new Creador();
	private IUsuarioDAO usuarioDAO;
	
	public static Creador getInstancia() {
		return instancia;
	}
	
	public Usuario crearUsuario(String nombre, String apellido, String nivel) throws CreationException {
		Usuario usuarioBuscado;
		Usuario usuarioCreado = new Usuario();
		try {
			usuarioBuscado = usuarioDAO.getUsuario(nombre, apellido);
			if (usuarioBuscado == null){
				usuarioCreado.setNombre(nombre);
				usuarioCreado.setApellido(apellido);
				usuarioCreado.setNivel(nivel);
				usuarioDAO.addUsuario(usuarioCreado);
			}else {
				throw new CreationException("Ya existe un usuario con ese nombre y apellido");
			}	
		} catch (DAOException e1) {
			e1.printStackTrace();
		}
		return usuarioCreado;
	}
	
	public void setUsuarioDAO(IUsuarioDAO usuarioDAO){
		this.usuarioDAO = usuarioDAO;
	}
}
