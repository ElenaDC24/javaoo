package es.curso;

public class Principal03 {

	public static void main(String[] args) {
		
	//don´t repeat yourself
		
		int numero1=5;
		int numero2=7;
		int numero8= 5;
		//invocación de la función
		//asignar resultado
		
		int resultado1=sumar(numero1, numero2, numero8);
		System.out.println("el resultado de la suma es:"+sumar(numero1,numero2,numero8));
		
		int numero3=8;
		int numero4=9;
		int numero7=2;
		//recibo el resultado y lo imprimo
		int resultado2=sumar(numero3, numero4, numero7);
		System.out.println("el resultado de la suma es:"+sumar(numero3,numero4, numero7));
		
		int numero5=4;
		int numero6=6;
		
		//invocación de la función
		//asignar resultado
		
		
		
	}
	//no es sencillo de entender
	public static int sumar(int n1,int n2,int n3) {
		
		int suma=n1+n2+n3;
		
		return suma;
	}
	public static int restar(int n1,int n2) {
		
		int resta = n1-n2;
		
		return resta;
	}

	
}
