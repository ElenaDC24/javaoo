package es.curso;
//sumar las areas de 4 rectangulos
public class Rectangulo3 {

	public static void main(String[] args) {
		
		Rectangulo R1=new Rectangulo();
		R1.setLado1 (3.0);
		R1.setLado2 (2.0);
		System.out.println("el area del primer rectangulo es "+R1.calcularArea());
				
		Rectangulo R2=new Rectangulo();
		R2.setLado1 (5.5);
		R2.setLado2 (7.2);
		System.out.println("el area del segundo rectangulo es "+R2.calcularArea());
		
		Rectangulo R3=new Rectangulo();
		R3.setLado1 (1.8);
		R3.setLado2 (2.75);
		System.out.println("el area del tercer rectangulo es "+R3.calcularArea());
		
		Rectangulo R4=new Rectangulo();
		R4.setLado1 (4.70);
		R4.setLado2(9.10);
		System.out.println("el area del cuarto rectangulo es "+R4.calcularArea());
		
		Rectangulo [] lista= new Rectangulo[] {R1,R2,R3,R4};
		
		double sumaArea=0;
		
	
		for (int i=0;i<lista.length;i++) {
			System.out.println(lista[i].calcularArea());
			sumaArea= sumaArea+ lista[i].calcularArea();
		}
		System.out.println(sumaArea);
		
			
		}
		
	}


