package es.curso;

public class PrincipalCuadrado  {

	public static void main(String[] args) {
		
		Cuadrado c1= new Cuadrado(2,2);
		c1.setLado1(2);
		c1.setLado2(3);
	
		System.out.println(c1.area(3));
	}

}
