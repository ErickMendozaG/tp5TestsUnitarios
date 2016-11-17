
public class CreationException extends Exception {
	
	private String mensaje;

	public CreationException(String string) {
		setMensaje(string);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
