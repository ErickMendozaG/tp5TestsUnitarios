import java.util.ArrayList;

public interface IUsuarioDAO {
	public void addUsuario(Usuario usuario) throws DAOException;
	public void borrarUsuario(int idUsuario) throws DAOException;
	public Usuario getUsuario(int idUsuario) throws DAOException;
	public Usuario getUsuario(String nombre, String apellido) throws DAOException;
	public ArrayList<Usuario> getUsuarios() throws DAOException;
	  
}
