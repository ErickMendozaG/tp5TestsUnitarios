package casosPrueba3y9;

public class Ejercicio {
	
	private int idEjercicio;
	private String nombreEjercicio;
	private String descripcionEjercicio;
	
	
	public Ejercicio(int idEjercicio, String nombreEjercicio) {
		super();
		this.idEjercicio = idEjercicio;
		this.nombreEjercicio = nombreEjercicio;
	}
	public int getIdEjercicio() {
		return idEjercicio;
	}
	public void setIdEjercicio(int idEjercicio) {
		this.idEjercicio = idEjercicio;
	}
	public String getNombreEjercicio() {
		return nombreEjercicio;
	}
	public void setNombreEjercicio(String nombreEjercicio) {
		this.nombreEjercicio = nombreEjercicio;
	}
	public String getDescripcionEjercicio() {
		return descripcionEjercicio;
	}
	public void setDescripcionEjercicio(String descripcionEjercicio) {
		this.descripcionEjercicio = descripcionEjercicio;
	}
	

}
