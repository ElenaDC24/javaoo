package es.curso;

public class Bombilla01 {

	public static void main(String[] args) {
		Bombilla b= new Bombilla();
		b.setIntensidad(2);
		b.incrementar();
		b.incrementar();
		System.out.println(b.getIntensidad());
		b.decrementar();
		System.out.println(b.getIntensidad()); 
		
			
	}

}
