
public class DAOException extends Exception {
	
	String mensaje;

	public DAOException(String string) {
		mensaje= string;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
