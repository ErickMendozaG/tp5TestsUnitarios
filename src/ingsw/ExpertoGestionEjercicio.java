package ingsw;

import java.util.List;
import java.util.Random;

public class ExpertoGestionEjercicio {
	
	public void registrarEjercicio(Usuario usuario, Ejercicio ejercicio, String respuestas){
		UsuarioEjercicio ejercicioResuelto = new UsuarioEjercicio(ejercicio, respuestas);
		usuario.addEjerciciosResueltos(ejercicioResuelto);
		this.calificarEjercicio(ejercicioResuelto, respuestas);
	}
	

	private void calificarEjercicio(UsuarioEjercicio ejercicioResuelto, String respuestas) {
		
		ejercicioResuelto.setPuntuacion(this.generarNotaAeatoria());
		
	}


	public boolean consultaEjercicio(Usuario usuario, Ejercicio ejercicio){
		
		List<UsuarioEjercicio> lista = usuario.getEjerciciosResueltos();
		
		boolean consulta = false;
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getEjercicio().equals(ejercicio)){
				consulta = true;
			};
		}
		return consulta;
		
	}
	
	
	public boolean consultaPuntuacionEjercicio(Usuario usuario, Ejercicio ejercicio){
		
		List<UsuarioEjercicio> lista = usuario.getEjerciciosResueltos();
		
		boolean consulta = false;
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getEjercicio().equals(ejercicio)){
				if(lista.get(i).getPuntuacion()>0){
					consulta = true;
				}
			};
		}
		return consulta;
		
	}
	
	
	private int generarNotaAeatoria(){
		
		Random rand = new Random();

		int nota = rand.nextInt(11);
		
		return nota;
	}
}
