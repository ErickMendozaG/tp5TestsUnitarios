package ingsw;

public class UsuarioEjercicio {
	
	private Ejercicio ejercicio;
	private boolean resuelto;
	private int puntuacion;
	private String respuesta;
	
	public UsuarioEjercicio(Ejercicio ejercicio, String respuesta) {
		super();
		this.ejercicio = ejercicio;
		this.respuesta = respuesta;
	}
	public Ejercicio getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}
	public boolean isResuelto() {
		return resuelto;
	}
	public void setResuelto(boolean resuelto) {
		this.resuelto = resuelto;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	
}
