package ingsw;

public class Usuarios {
	String nombre;
	String apellido;
	NivelUsuario nivel;

	public Usuarios(String nombre,String apellido,NivelUsuario nivel){
		this.nombre = nombre;
		this.apellido = apellido;
		this.nivel = nivel;
		
	}

	public boolean usarCalculadora() {
		if(nivel.getNombreNivel() == "Avanzado"){
			return true;
		}
		else return false;
	}
	
}
