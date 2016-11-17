package casosPrueba3y9;

import java.util.List;
import java.util.Vector;

public class Usuario {
	
	private int nroUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	
	private List<UsuarioEjercicio> ejerciciosResueltos;
	
	public Usuario(int i, String nombreUsuario, String apellidoUsuario) {
		super();
		this.nroUsuario = i;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		ejerciciosResueltos = new Vector<UsuarioEjercicio>();
	}
	public int getNroUsuario() {
		return nroUsuario;
	}
	public void setNroUsuario(int nroUsuario) {
		this.nroUsuario = nroUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public List<UsuarioEjercicio> getEjerciciosResueltos() {
		return ejerciciosResueltos;
	}
	public void addEjerciciosResueltos(UsuarioEjercicio ejerciciosResueltos) {
		this.ejerciciosResueltos.add(ejerciciosResueltos);
	}
	
	
}
