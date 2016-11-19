
public class Calculadora {
	public Calculadora(Usuario usu) {
		if(usu.tipo.getCodigo()==1){
			Calculadora calc = new Calculadora();
		}
		System.out.println("FALLO CREAR CALC");
	}

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

}
