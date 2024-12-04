package es.curso;

public class Principal9 {
//es el 7 de cecilio
	public static void main(String[] args) {
	//le pedimos que nos devuelva el numero mayor de la lista	
		
		int[] lista= new int[] {2,5,6,7};
		//recorrer e imprimir los valores de la lista
		
		
		for (int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}
	//invoco la funcion
		int mayor= numeroMayor(lista);
		System.out.println("******");
		System.out.println(mayor);
	}
	public static int numeroMayor(int[] miArray) {
		
		int mayor=0;
	
	for (int i=0;i<miArray.length;i++) {	
		
		if (miArray[i]> mayor) {
			mayor = miArray[i];
	
	}
		
	}
	return mayor;
}}
	
